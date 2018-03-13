package com.readlearncode.producers;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Publisher {

    @Inject
    private Event<String> message;

    public void message(){
        message.fireAsync("test");
    }

}