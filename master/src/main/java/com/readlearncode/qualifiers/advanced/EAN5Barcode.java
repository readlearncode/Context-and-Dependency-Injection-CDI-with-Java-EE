package com.readlearncode.qualifiers.advanced;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Barcode(type = Barcode.Type.EAN5)
public class EAN5Barcode implements CodeGenerator {
    @Override
    public String generateCode() {
        return "EAN5: 9791234567896";
    }
}