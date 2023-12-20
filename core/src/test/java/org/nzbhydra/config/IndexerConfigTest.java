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

package org.nzbhydra.config;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.nzbhydra.config.indexer.IndexerConfig;
import org.nzbhydra.config.validation.ConfigValidationResult;
import org.nzbhydra.config.validation.IndexerConfigValidator;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class IndexerConfigTest {

    @InjectMocks
    private IndexerConfig testee = new IndexerConfig();
    private IndexerConfigValidator indexerConfigValidator = new IndexerConfigValidator();

    @Test
    void shouldValidateSchedules() {
        testee.setSchedule(Arrays.asList("blabla"));
        testee.setName("indexer");
        BaseConfig baseConfig = new BaseConfig();
        baseConfig.setIndexers(Arrays.asList(testee));
        ConfigValidationResult result = indexerConfigValidator.validateConfig(baseConfig, null, testee);

        assertThat(result.getErrorMessages()).containsExactly("Indexer indexer contains an invalid schedule: blabla");

        testee.setSchedule(Arrays.asList("mo8-10"));
        result = indexerConfigValidator.validateConfig(baseConfig, null, testee);
        assertThat(result.getErrorMessages()).isEmpty();
    }


}
