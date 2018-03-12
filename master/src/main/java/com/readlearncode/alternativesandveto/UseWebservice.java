package com.readlearncode.alternativesandveto;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class UseWebservice {

    @Inject
    private Webservice webservice;

    public void go() {
        webservice.getRemoteData()
                .stream()
                .forEach(System.out::println);
    }

}