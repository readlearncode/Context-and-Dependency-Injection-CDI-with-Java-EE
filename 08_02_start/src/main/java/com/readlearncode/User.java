package com.readlearncode;

import javax.enterprise.inject.Model;
import javax.faces.annotation.FacesConfig;

import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Model
@FacesConfig(version = JSF_2_3)
public class User {

    private String name;

    public User() {
        this.name = "John Smith";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object update() {
        return "search?faces-redirect=true";
    }
}