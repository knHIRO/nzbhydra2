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

package org.nzbhydra.config.migration;

import java.util.ArrayList;
import java.util.Map;

public class ConfigMigrationStep009to010 implements ConfigMigrationStep {

    @Override
    public int forVersion() {
        return 9;
    }

    @Override
    public Map<String, Object> migrate(Map<String, Object> toMigrate) {
        Map<String, Object> authConfig = getFromMap(toMigrate, "auth");

        if (authConfig.containsKey("authHeaderIpRanges") && authConfig.get("authHeaderIpRanges") == null) {
            authConfig.put("authHeaderIpRanges", new ArrayList<>());
        }
        return toMigrate;
    }
}
