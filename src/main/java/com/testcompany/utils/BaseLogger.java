package com.testcompany.utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseLogger {
    protected final Logger logger = LogManager.getLogger(this.getClass());

    public void logInfo(String message) {
        logger.info(message);
    }

    public void logDebug(String message) {
        logger.debug(message);
    }

    public void logError(String message) {
        logger.error(message);
    }

    public void logWarn(String message) {
        logger.warn(message);
    }
}
