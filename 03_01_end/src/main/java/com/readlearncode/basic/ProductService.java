package com.readlearncode.basic;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    @Inject @EAN13
    private CodeGenerator codeGenerator;

    @Inject @EAN5
    private CodeGenerator EAN5CodeGenerator;

    @Inject
    public ProductService(@EAN13 CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Inject
    public void setCodeGenerator(@EAN13 CodeGenerator codeGenerator) {}

    public Product generateCode(Product product) {

        String barcode = codeGenerator.generateCode();

        product.setCode(barcode);

        return product;
    }


}