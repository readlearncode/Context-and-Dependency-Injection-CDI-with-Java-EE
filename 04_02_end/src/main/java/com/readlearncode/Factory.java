package com.readlearncode;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Factory {

    @Produces
    @ShirtFactory
    public Shirt makeShirt(@Any Instance<Shirt> instance, InjectionPoint injectionPoint) {

        Colour.Name colour = injectionPoint
                .getAnnotated()
                .getAnnotation(Colour.class)
                .name();

        return new Shirt(colour);
    }

}