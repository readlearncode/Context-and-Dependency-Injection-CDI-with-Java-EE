package com.readlearncode.introduction.withcdi;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Library {

    @Inject
    private LendingService lendingService;

    @Inject
    private BookPurchasingService bookPurchasingService;


    public void performLibraryFunction() {

        lendingService.lendBook(new Book("Fun with Java"));
        lendingService.lendBook(new Book("Java EE 8: Only What's New"));
        bookPurchasingService.purchaseBooks(new Book("Java is great"), new Book("Java SE 8"));

    }

}