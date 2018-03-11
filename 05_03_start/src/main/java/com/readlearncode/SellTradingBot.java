package com.readlearncode;

import javax.enterprise.event.Observes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SellTradingBot {

    public void action(@Observes PriceChangeEvent priceChangeEvent) {
        if (priceChangeEvent.getPriceChange() < 0) {
            System.out.println("SELL: " + priceChangeEvent.getStock());
        }
    }

}