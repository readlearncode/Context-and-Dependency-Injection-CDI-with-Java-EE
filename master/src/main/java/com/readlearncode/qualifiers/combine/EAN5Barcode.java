package com.readlearncode.qualifiers.combine;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Barcode(type = Barcode.Type.EAN5)
public class EAN5Barcode implements BarcodeGenerator {
    @Override
    public String generateBarcode() {
        return "EAN5: 9791234567896";
    }
}