package com.readlearncode._playzone;

import javax.enterprise.event.ObservesAsync;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Observer {

    public void see(@ObservesAsync String message){
        System.out.println(message);
    }
}