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

package org.nzbhydra.searching.dtoseventsenums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nzbhydra.searching.SortableMessage;
import org.nzbhydra.searching.searchrequests.SearchRequest;
import org.nzbhydra.springnative.ReflectionMarker;

@Data
@ReflectionMarker
@AllArgsConstructor
@NoArgsConstructor
public class SearchMessageEvent {

    private SearchRequest searchRequest;
    private SortableMessage message;

    public SearchMessageEvent(SearchRequest searchRequest, String message) {
        this.searchRequest = searchRequest;
        this.message = new SortableMessage(message, message);
    }

    public SearchMessageEvent(SearchRequest searchRequest, String message, String messageSortValue) {
        this.searchRequest = searchRequest;
        this.message = new SortableMessage(message, messageSortValue);
    }

}
