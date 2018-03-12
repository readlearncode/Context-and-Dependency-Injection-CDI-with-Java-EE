package com.readlearncode.eventsandobservers.async;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.util.concurrent.TimeUnit;

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
        container.select(StockObserver.class).get().priceChange(new PriceChangeEvent(100f, 8f, "Big Burger Corp"));
        TimeUnit.SECONDS.sleep(1);
        container.select(StockObserver.class).get().priceChange(new PriceChangeEvent(100f, -5f, "Banko Corp"));
        TimeUnit.SECONDS.sleep(1);
        container.select(StockObserver.class).get().priceChange(new PriceChangeEvent(100f, -15f, "Food n' Stuff Corp"));
        TimeUnit.SECONDS.sleep(1);
        container.select(StockObserver.class).get().priceChange(new PriceChangeEvent(100f, 0f, "Steal Corp"));
        TimeUnit.SECONDS.sleep(1);
        container.select(StockObserver.class).get().priceChange(new PriceChangeEvent(100f, -20f, "Steal Corp"));
        TimeUnit.SECONDS.sleep(1);
        container.select(StockObserver.class).get().priceChange(new PriceChangeEvent(100f, 30f, "Steal Corp"));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("------------------------------------------------");

        container.close();
    }
}