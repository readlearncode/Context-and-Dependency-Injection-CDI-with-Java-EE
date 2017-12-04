package com.readlearncode.introduction.withoutcdi;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Library {

    private LendingService lendingService = new LendingService();

    private BookPurchasingService bookPurchasingService = new BookPurchasingService();


    public void performLibraryFunction() {

        lendingService.lendBook(new Book("Fun with Java"));
        lendingService.lendBook(new Book("Java EE 8: Only What's New "));

        bookPurchasingService.purchaseBooks(new Book("Java is great"), new Book("Java SE 8"));

    }

}