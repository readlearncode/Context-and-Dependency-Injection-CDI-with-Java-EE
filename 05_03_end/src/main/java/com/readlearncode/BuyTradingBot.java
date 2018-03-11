package com.readlearncode;

import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BuyTradingBot {

    public void action(@ObservesAsync PriceChangeEvent priceChangeEvent) {
        if (priceChangeEvent.getPriceChange() > 0) {
            System.out.println("BUY: " + priceChangeEvent.getStock());
        }
    }

}