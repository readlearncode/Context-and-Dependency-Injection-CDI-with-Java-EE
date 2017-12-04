package com.readlearncode.qualifiers.advanced;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    @Inject @Barcode(type = Barcode.Type.EAN8)
    private BarcodeGenerator barcodeGenerator;

    public Product generateBarcode(Product product) {

        String barcode = barcodeGenerator.generateBarcode();

        product.setBarcode(barcode);

        return product;
    }


}