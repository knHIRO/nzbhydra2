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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class ConfigMigrationStep015to016 implements ConfigMigrationStep {

    private static final Logger logger = LoggerFactory.getLogger(ConfigMigration.class);

    @Override
    public int forVersion() {
        return 15;
    }

    @Override
    public Map<String, Object> migrate(Map<String, Object> toMigrate) {
        try {
            List<Map<String, Object>> indexers = (List<Map<String, Object>>) toMigrate.get("indexers");
            for (Map<String, Object> indexer : indexers) {
                final Integer score = (Integer) indexer.get("score");
                if (score == null) {
                    indexer.put("score", 0);
                }
            }
            toMigrate.put("indexers", indexers);

        } catch (Exception e) {
            logger.error("Error while migrating indexers scores", e);
        }

        return toMigrate;
    }
}
