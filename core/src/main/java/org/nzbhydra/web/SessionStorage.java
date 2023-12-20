package org.nzbhydra.web;

import org.nzbhydra.mapping.newznab.OutputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionStorage {

    private static final Logger logger = LoggerFactory.getLogger(SessionStorage.class);

    public static final ThreadLocal<String> username =
            ThreadLocal.withInitial(() -> null);
    public static final ThreadLocal<String> IP =
            ThreadLocal.withInitial(() -> null);
    public static final ThreadLocal<String> originalIp =
            ThreadLocal.withInitial(() -> null);
    public static final ThreadLocal<String> userAgent =
            ThreadLocal.withInitial(() -> null);
    public static final ThreadLocal<String> requestUrl =
            ThreadLocal.withInitial(() -> null);
    public static final ThreadLocal<OutputType> outputType =
            ThreadLocal.withInitial(() -> null);


}
