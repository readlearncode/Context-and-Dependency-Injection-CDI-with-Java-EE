package com.readlearncode;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Tailor {

    @Inject
    @ShirtFactory
    @Colour(name = Colour.Name.GREEN)
    private Shirt shirt;

    public void makeSuit() {
        System.out.println("Colour:" + shirt.getColour());
    }

}