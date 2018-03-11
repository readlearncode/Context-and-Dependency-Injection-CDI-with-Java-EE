package com.readlearncode;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NotificationBot1 {
    public void action(@ObservesAsync @Priority(100) PriceChangeEvent priceChangeEvent) {
        System.out.println("Notification 1: " + priceChangeEvent.getStock());
    }
}