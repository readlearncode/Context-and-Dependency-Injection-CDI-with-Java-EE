package com.readlearncode.qualifiers.Combine;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BookService {

    @Inject
    @Barcode(type = Barcode.Type.EAN8)
    @Language(locale = Language.Locale.SPANISH)
    private BarcodeGenerator barcodeGenerator;

    public Book generateBarcode(Book book) {

        String barcode = barcodeGenerator.generateBarcode();

        book.setBarcode(barcode);

        return book;
    }


}