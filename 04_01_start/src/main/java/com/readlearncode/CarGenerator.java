package com.readlearncode;

import javax.ws.rs.Produces;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CarGenerator {

    @Produces
    @Ford
    public Car makeCar(){
        return new Car();
    }
}