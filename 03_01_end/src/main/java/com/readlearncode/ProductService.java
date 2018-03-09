package com.readlearncode;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    @Inject @EAN5
    private CodeGenerator codeGenerator;

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