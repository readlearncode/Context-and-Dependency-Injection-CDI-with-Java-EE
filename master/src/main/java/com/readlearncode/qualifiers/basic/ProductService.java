package com.readlearncode.qualifiers.basic;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    private CodeGenerator codeGenerator;

    @Inject
    public ProductService(@EAN13 CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public Product generateBarcode(Product product) {

        String barcode = codeGenerator.generateCode();

        product.setCode(barcode);

        return product;
    }


}