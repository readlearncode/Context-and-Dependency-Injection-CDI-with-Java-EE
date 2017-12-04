package com.readlearncode.qualifiers.advanced;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BootStrap {

    public static void main(String... args) {

        SeContainer container = SeContainerInitializer.newInstance().initialize();

        System.out.println("------------------------------------------------");

        Book funWithJava = new Book("Fun with Java");

        container.select(BookService.class).get().generateBarcode(funWithJava);

        System.out.println(funWithJava.getBarcode());


        System.out.println("------------------------------------------------");

        container.close();
    }
}