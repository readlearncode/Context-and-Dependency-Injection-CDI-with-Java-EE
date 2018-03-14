package com.readlearncode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RUNTIME)
public @interface Colour {

    Name name();

    enum Name {RED, GREEN, BLUE}

}
