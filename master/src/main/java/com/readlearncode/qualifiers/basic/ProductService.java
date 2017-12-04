package com.readlearncode.qualifiers.basic;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    @Inject @EAN13
    private BarcodeGenerator barcodeGenerator;

    public Product generateBarcode(Product product) {

        String barcode = barcodeGenerator.generateBarcode();

        product.setBarcode(barcode);

        return product;
    }


}