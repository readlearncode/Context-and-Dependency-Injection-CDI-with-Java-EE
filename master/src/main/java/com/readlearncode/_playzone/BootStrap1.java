package com.readlearncode._playzone;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BootStrap1 {

    public static void main(String... args){

        SeContainer container = SeContainerInitializer.newInstance().initialize();

        System.out.println("------------------------------------------------");
        History history = container.select(History.class).get();
        System.out.println(history.bookDetails());


        container.select(Publisher.class).get().message();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        container.close();
        System.out.println("------------------------------------------------");

    }
}