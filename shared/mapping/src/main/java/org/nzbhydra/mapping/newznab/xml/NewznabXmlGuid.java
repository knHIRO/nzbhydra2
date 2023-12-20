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

package org.nzbhydra.mapping.newznab.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Data;
import org.nzbhydra.springnative.ReflectionMarker;


@XmlRootElement(name = "guid")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@ReflectionMarker
public class NewznabXmlGuid {

    public NewznabXmlGuid() {

    }

    public NewznabXmlGuid(String guid, boolean isPermaLink) {
        this.guid = guid;
        this.isPermaLink = isPermaLink;
    }

    @XmlValue
    private String guid;

    @XmlAttribute
    private boolean isPermaLink = false;


}
