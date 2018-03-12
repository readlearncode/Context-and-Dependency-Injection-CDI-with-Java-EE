package com.readlearncode.eventsandobservers.async;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Priority(100)
public class SellTradingBot {

    public void action(@ObservesAsync PriceChangeEvent priceChangeEvent) {
        throw new NullPointerException();
//        if (priceChangeEvent.getPriceChange() < 0) {
//            System.out.println("SELL: " + priceChangeEvent.getStock());
//        }
    }

}