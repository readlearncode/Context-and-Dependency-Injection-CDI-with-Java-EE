package com.readlearncode;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class LogObserver {

    @Inject
    private Event<LogEvent> log;

    public void logEvent(LogEvent logEvent) {
        log.fireAsync(logEvent);
    }

}