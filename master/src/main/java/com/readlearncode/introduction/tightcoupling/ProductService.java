package com.readlearncode.introduction.tightcoupling;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    private EAN13Barcode ean13Barcode;

    ProductService(EAN13Barcode ean13Barcode){
        this.ean13Barcode = ean13Barcode;
    }

    public Product generateCode(Product product) {
        String barcode = ean13Barcode.generateCode();
        product.setCode(barcode);
        return product;
    }

}