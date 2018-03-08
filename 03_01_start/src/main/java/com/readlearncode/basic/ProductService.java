package com.readlearncode.basic;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    private CodeGenerator codeGenerator;

    public ProductService(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setCodeGenerator(CodeGenerator codeGenerator) {}

    public Product generateCode(Product product) {

        String barcode = codeGenerator.generateCode();

        product.setCode(barcode);

        return product;
    }


}