package com.readlearncode.loosecoupling;


/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EAN5Barcode implements CodeGenerator {
    @Override
    public String generateCode() {
        return "EAN5: 9791234567896";
    }
}