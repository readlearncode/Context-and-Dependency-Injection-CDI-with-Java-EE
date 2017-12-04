package com.readlearncode.qualifiers.Combine;


import javax.inject.Qualifier;
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
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RUNTIME)
@Qualifier
public @interface Language {

    Locale locale();

     enum Locale {
        ENGLISH, FRENCH, SPANISH
    }
}