package com.readlearncode.qualifiers.combine;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    @Inject
    @Barcode(type = Barcode.Type.EAN8)
    @Language(locale = Language.Locale.SPANISH)
    private CodeGenerator codeGenerator;

    public Product generateBarcode(Product product) {

        String barcode = codeGenerator.generateCode();

        product.setCode(barcode);

        return product;
    }


}