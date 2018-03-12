package com.readlearncode;

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

        SeContainer seContainer = SeContainerInitializer.newInstance().initialize();

        System.out.println("------------------------------------------------");
        seContainer.select(StockObserver.class).get().priceChange(new PriceChangeEvent("Big Burger Corp", 100f, 8f ));
        TimeUnit.SECONDS.sleep(1);
        seContainer.select(StockObserver.class).get().priceChange(new PriceChangeEvent("Banko Corp",150f, -7f));
        TimeUnit.SECONDS.sleep(1);
        seContainer.select(StockObserver.class).get().priceChange(new PriceChangeEvent("Food n' Stuff Corp",250f, -100f));
        TimeUnit.SECONDS.sleep(1);
        seContainer.select(StockObserver.class).get().priceChange(new PriceChangeEvent("Steal Corp", 200f, -50f));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("------------------------------------------------");

        seContainer.close();
    }
}