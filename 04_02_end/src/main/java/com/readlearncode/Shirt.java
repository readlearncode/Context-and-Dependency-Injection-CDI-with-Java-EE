package com.readlearncode;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Shirt {

    private Colour.Name colour;

    public Shirt(){ }

    public Shirt(Colour.Name colour) {
        this.colour = colour;
    }

    public Colour.Name getColour() {
        return colour;
    }

    public void setColour(Colour.Name colour) {
        this.colour = colour;
    }
}