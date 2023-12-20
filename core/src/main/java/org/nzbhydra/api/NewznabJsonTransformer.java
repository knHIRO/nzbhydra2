/*
 *  (C) Copyright 2017 TheOtherP (theotherp@posteo.net)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.nzbhydra.api;

import org.nzbhydra.config.ConfigProvider;
import org.nzbhydra.config.downloading.DownloadType;
import org.nzbhydra.downloading.FileHandler;
import org.nzbhydra.mapping.newznab.NewznabResponse;
import org.nzbhydra.mapping.newznab.json.NewznabJsonChannel;
import org.nzbhydra.mapping.newznab.json.NewznabJsonChannelResponse;
import org.nzbhydra.mapping.newznab.json.NewznabJsonEnclosure;
import org.nzbhydra.mapping.newznab.json.NewznabJsonEnclosureAttributes;
import org.nzbhydra.mapping.newznab.json.NewznabJsonItem;
import org.nzbhydra.mapping.newznab.json.NewznabJsonItemAttr;
import org.nzbhydra.mapping.newznab.json.NewznabJsonItemAttributes;
import org.nzbhydra.mapping.newznab.json.NewznabJsonResponseAttributes;
import org.nzbhydra.mapping.newznab.json.NewznabJsonRoot;
import org.nzbhydra.searching.dtoseventsenums.SearchResultItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class NewznabJsonTransformer {

    private static final String APPLICATION_TYPE_NZB = "application/x-nzb";
    private static final String APPLICATION_TYPE_TORRENT = "application/x-bittorrent";

    @Autowired
    protected FileHandler nzbHandler;
    @Autowired
    protected ConfigProvider configProvider;

    NewznabJsonRoot transformToRoot(List<SearchResultItem> searchResultItems, Integer offset, int total, boolean isNzb) {
        NewznabJsonRoot rssRoot = new NewznabJsonRoot();

        NewznabJsonChannel channel = new NewznabJsonChannel();

        channel.setTitle("NZBHydra 2");
        channel.setLink("https://www.github.com/theotherp/nzbhydra2");
        channel.setWebMaster("theotherp@posteo.net");
        channel.setResponse(new NewznabJsonChannelResponse(new NewznabJsonResponseAttributes(offset, total)));
        channel.setGenerator("NZBHydra2");

        rssRoot.setChannel(channel);
        List<NewznabJsonItem> items = new ArrayList<>();
        for (SearchResultItem searchResultItem : searchResultItems) {
            NewznabJsonItem rssItem = buildRssItem(searchResultItem, isNzb);
            items.add(rssItem);
        }

        channel.setItem(items);
        rssRoot.setSearchType(isNzb ? NewznabResponse.SearchType.NEWZNAB : NewznabResponse.SearchType.TORZNAB);
        return rssRoot;
    }

    private NewznabJsonItem buildRssItem(SearchResultItem searchResultItem, boolean isNzb) {
        NewznabJsonItem rssItem = new NewznabJsonItem();
        String link = nzbHandler.getDownloadLinkForResults(searchResultItem.getSearchResultId(), false, DownloadType.NZB);
        rssItem.setLink(link);
        rssItem.setTitle(searchResultItem.getTitle());
        rssItem.setGuid(String.valueOf(searchResultItem.getGuid()));
        rssItem.setId(String.valueOf(searchResultItem.getGuid()));
        if (searchResultItem.getPubDate() != null) {
            rssItem.setPubDate(searchResultItem.getPubDate());
        } else {
            rssItem.setPubDate(searchResultItem.getBestDate()); //Contain usenet date because results with neither should've been
        }
        searchResultItem.getAttributes().put("guid", String.valueOf(searchResultItem.getSearchResultId()));
        List<NewznabJsonItemAttributes> attributes = searchResultItem.getAttributes().entrySet().stream().map(attribute -> new NewznabJsonItemAttributes(attribute.getKey(), attribute.getValue())).sorted(Comparator.comparing(NewznabJsonItemAttributes::getName)).collect(Collectors.toList());
        attributes.add(new NewznabJsonItemAttributes("hydraIndexerScore", String.valueOf(searchResultItem.getIndexer().getConfig().getScore())));
        attributes.add(new NewznabJsonItemAttributes("hydraIndexerHost", String.valueOf(searchResultItem.getIndexer().getConfig().getHost())));
        attributes.add(new NewznabJsonItemAttributes("hydraIndexerName", String.valueOf(searchResultItem.getIndexer().getName())));
        String resultType;
        if (isNzb) {
            rssItem.setAttr(attributes.stream().map(NewznabJsonItemAttr::new).collect(Collectors.toList()));
            resultType = APPLICATION_TYPE_NZB;
        } else {
            resultType = APPLICATION_TYPE_TORRENT;
        }
        rssItem.setEnclosure(new NewznabJsonEnclosure(new NewznabJsonEnclosureAttributes(link, searchResultItem.getSize(), resultType)));
        rssItem.setComments(searchResultItem.getCommentsLink());
        rssItem.setDescription(searchResultItem.getDescription());
        rssItem.setCategory(configProvider.getBaseConfig().getSearching().isUseOriginalCategories() ? searchResultItem.getOriginalCategory() : searchResultItem.getCategory().getName());
        return rssItem;
    }
}
