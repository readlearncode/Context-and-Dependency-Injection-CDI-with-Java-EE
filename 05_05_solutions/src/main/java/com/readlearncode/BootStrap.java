package com.readlearncode;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import static com.readlearncode.LogEvent.LEVEL.ERROR;
import static com.readlearncode.LogEvent.LEVEL.SEVERE;
import static com.readlearncode.LogEvent.LEVEL.WARN;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BootStrap {

    public static void main(String... args) throws InterruptedException {

        SeContainer container = SeContainerInitializer.newInstance().initialize();

        System.out.println("------------------------------------------------");
        container.select(LogObserver.class).get().logEvent(new LogEvent(WARN, "Nothing serious has happened"));
        container.select(LogObserver.class).get().logEvent(new LogEvent(SEVERE, "Run for the hills. It's all going down!!!"));
        container.select(LogObserver.class).get().logEvent(new LogEvent(ERROR, "Opps an error occurred"));
        System.out.println("------------------------------------------------");

        container.close();
    }
}