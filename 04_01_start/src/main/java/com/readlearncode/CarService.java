package com.readlearncode;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CarService {

    @Inject @Ford
    private Car car;

    public void print(){
        System.out.println(car.name);
    }

}