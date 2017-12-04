package com.readlearncode.qualifiers.basic;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BookService {

    @Inject @EAN13
    private BarcodeGenerator barcodeGenerator;

    public Book generateBarcode(Book book) {

        String barcode = barcodeGenerator.generateBarcode();

        book.setBarcode(barcode);

        return book;
    }


}