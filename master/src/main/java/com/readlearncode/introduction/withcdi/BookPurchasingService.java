package com.readlearncode.introduction.withcdi;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BookPurchasingService {

    public Book[] purchaseBooks(Book... books){
        System.out.println(books.length + " books purchased");
        return books;
    }
}