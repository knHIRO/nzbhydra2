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

package org.nzbhydra.downloading;

/**
 * Thrown when a torrent is to be downloaded but redirects to a magnet link
 */
public class MagnetLinkRedirectException extends Exception {

    private String magnetLink;

    public MagnetLinkRedirectException(String magnetLink) {
        this.magnetLink = magnetLink;
    }

    public String getMagnetLink() {
        return magnetLink;
    }
}
