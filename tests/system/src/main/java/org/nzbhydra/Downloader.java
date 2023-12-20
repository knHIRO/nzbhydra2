/*
 *  (C) Copyright 2023 TheOtherP (theotherp@posteo.net)
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

package org.nzbhydra;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.assertj.core.api.Assertions;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlItem;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Downloader {

    @Autowired
    private HydraClient hydraClient;

    public NewznabXmlItem searchSomethingAndTriggerDownload(String query) throws Exception {
        final HydraResponse response = hydraClient.get("/api", "apikey=apikey", "t=search", "q=" + query);
        final String body = response.body();
        NewznabXmlRoot root = Jackson.getUnmarshal(body);
        Assertions.assertThat(root).isNotNull();
        Assertions.assertThat(root.getRssChannel().getItems()).isNotEmpty();
        final NewznabXmlItem firstItem = root.getRssChannel().getItems().get(0);
        final String link = firstItem.getLink();
        try (Response downloadResponse = new OkHttpClient().newCall(new Request.Builder().url(link).build()).execute()) {
            final ResponseBody downloadBody = downloadResponse.body();
            Assertions.assertThat(downloadBody.string()).contains("Would download NZB");
        }
        return firstItem;
    }
}
