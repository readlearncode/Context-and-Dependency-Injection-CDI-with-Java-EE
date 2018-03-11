package com.readlearncode;

import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ServerLogEvent {

    public void logEvent(@ObservesAsync LogEvent logEvent){
        if(logEvent.getLevel().equals(LogEvent.LEVEL.SERVER)){
            System.out.println("Red Alert - Server log event: " + logEvent.getMessage());
        }
    }

}