package com.readlearncode.eventsandobservers.async;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class StockObserver {

    @Inject
    Event<PriceChangeEvent> event;

    public void priceChange(PriceChangeEvent priceChangeEvent) {
        event.fireAsync(priceChangeEvent);
    }

}