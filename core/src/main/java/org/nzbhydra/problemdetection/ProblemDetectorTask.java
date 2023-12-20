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

package org.nzbhydra.problemdetection;

import com.google.common.base.Stopwatch;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
import org.nzbhydra.debuginfos.DebugInfosProvider;
import org.nzbhydra.genericstorage.GenericStorage;
import org.nzbhydra.logging.LoggingMarkers;
import org.nzbhydra.tasks.HydraTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class ProblemDetectorTask {

    private static final Logger logger = LoggerFactory.getLogger(ProblemDetectorTask.class);

    private static final long HOUR = 1000 * 60 * 60;

    @Autowired
    List<ProblemDetector> problemDetectors;

    @Autowired
    private GenericStorage genericStorage;

    @PostConstruct
    public void init() {
        //Check on startup if the wrapper has been updated
        if (!DebugInfosProvider.isRunInDocker() && !SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_17)) {
            genericStorage.save("belowJava17", true);
            logger.info("Current Java version is below Java 17: " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        } else {
            genericStorage.save("belowJava17", false);
        }

    }


    @HydraTask(configId = "ProblemDetector", name = "Problem detector", interval = HOUR)
    public void detectProblems() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        try {
            for (ProblemDetector problemDetector : problemDetectors) {
                logger.debug("Executing problem detector {}", problemDetector.getClass().getName());
                problemDetector.executeCheck();
                logger.debug("Finished executing problem detector {}", problemDetector.getClass().getName());
            }
        } finally {
            logger.debug(LoggingMarkers.PERFORMANCE, "Check for problems took {}ms", stopwatch.elapsed(TimeUnit.MILLISECONDS));
        }
    }


}
