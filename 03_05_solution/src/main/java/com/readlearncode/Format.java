package com.readlearncode;

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
public @interface Format {

    Type type();

    enum Type {
        BOOK, MAGAZINE, NEWSPAPER, DVD
    }

    Locale locale();

    enum Locale {
        ENGLISH, CHINESE, SPANISH
    }
}
