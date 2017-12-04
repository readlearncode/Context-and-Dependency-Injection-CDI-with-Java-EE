package com.readlearncode.qualifiers;

import com.readlearncode._playzone.Publisher;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BootStrap {

    public static void main(String... args){

        SeContainer container = SeContainerInitializer.newInstance().initialize();

        System.out.println("------------------------------------------------");

        container.select(Publisher.class).get().message();


        System.out.println("------------------------------------------------");

        container.close();
    }
}