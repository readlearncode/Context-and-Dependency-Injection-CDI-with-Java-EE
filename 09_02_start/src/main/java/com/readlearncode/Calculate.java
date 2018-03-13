package com.readlearncode;

import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import java.io.Serializable;

import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */

@Named
@SessionScoped
@FacesConfig(version = JSF_2_3)
public class Calculate implements Serializable {

    private int x;
    private int y;
    private int result;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String calculateResult() {
        result = x + y;
        return "result?faces-redirect=true";
    }
}