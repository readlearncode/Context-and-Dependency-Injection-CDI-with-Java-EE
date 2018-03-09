package com.readlearncode;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PublicationService {

    @Inject
    @Format(type = Format.Type.BOOK, locale = Format.Locale.CHINESE)
    private Publication publication;

    public void print(){
        System.out.println(publication.getClass());
    }

}