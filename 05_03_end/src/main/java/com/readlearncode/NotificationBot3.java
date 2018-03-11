package com.readlearncode;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NotificationBot3 {

    public void action(@ObservesAsync @Priority(50) PriceChangeEvent priceChangeEvent) {
        System.out.println("Notification 3: " + priceChangeEvent.getStock());
    }
}