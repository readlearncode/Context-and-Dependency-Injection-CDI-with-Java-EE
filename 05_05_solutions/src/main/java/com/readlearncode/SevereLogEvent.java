package com.readlearncode;

import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SevereLogEvent {

    public void logEvent(@ObservesAsync LogEvent logEvent){
        if(logEvent.getLevel().equals(LogEvent.LEVEL.SEVERE)){
            System.out.println("Red Alert - Severe log event: " + logEvent.getMessage());
        }
    }

}