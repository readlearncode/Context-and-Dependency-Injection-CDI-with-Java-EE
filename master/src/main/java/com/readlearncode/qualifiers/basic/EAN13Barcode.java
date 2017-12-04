package com.readlearncode.qualifiers.basic;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@EAN13
public class EAN13Barcode implements CodeGenerator {
    @Override
    public String generateCode() {
        return "EAN13: 9780735200449";
    }
}