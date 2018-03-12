package com.readlearncode.eventsandobservers.async;

import javax.enterprise.event.Observes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CrashNotificationBot {

    public void action(@Observes PriceChangeEvent priceChangeEvent) {
        if ( priceChangeEvent.getPriceChange()/priceChangeEvent.getPrice() < -0.1) {
            System.out.println("WARNING: possible stock crash in progress with: " + priceChangeEvent.getStock());
        }
    }

}