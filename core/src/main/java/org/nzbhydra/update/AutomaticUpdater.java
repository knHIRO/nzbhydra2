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

package org.nzbhydra.update;

import org.nzbhydra.config.ConfigProvider;
import org.nzbhydra.genericstorage.GenericStorage;
import org.nzbhydra.tasks.HydraTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AutomaticUpdater {

    public static String TO_NOTICE_KEY = "automaticUpdateToNotice";

    @Autowired
    private ConfigProvider configProvider;
    @Autowired
    private UpdateManager updateManager;
    @Autowired
    private GenericStorage genericStorage;

    private static final Logger logger = LoggerFactory.getLogger(AutomaticUpdater.class);

    private static final long HOUR = 1000 * 60 * 60;

    @HydraTask(configId = "installUpdate", name = "Check for and install updates", interval = HOUR)
    @Transactional
    public void checkAndInstall() {
        try {
            if (updateManager.isUpdatedExternally()) {
                return;
            }
            final UpdateManager.UpdateInfo updateInfo = updateManager.getUpdateInfo();
            if (configProvider.getBaseConfig().getMain().isUpdateAutomatically() && updateInfo.isUpdateAvailable()) {
                logger.info("Automatic updater found update");

                updateManager.installUpdate(updateInfo.getLatestVersion(), true);
            }
        } catch (UpdateException e) {
            logger.error("Error while installing update", e);
        }
    }

}
