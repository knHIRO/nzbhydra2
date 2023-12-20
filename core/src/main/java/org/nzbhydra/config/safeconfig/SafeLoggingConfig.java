package org.nzbhydra.config.safeconfig;

import lombok.Getter;
import org.nzbhydra.config.LoggingConfig;


@Getter
public class SafeLoggingConfig {

    private String historyUserInfoType;

    public SafeLoggingConfig(LoggingConfig loggingConfig) {
        historyUserInfoType = loggingConfig.getHistoryUserInfoType().name();
    }


}
