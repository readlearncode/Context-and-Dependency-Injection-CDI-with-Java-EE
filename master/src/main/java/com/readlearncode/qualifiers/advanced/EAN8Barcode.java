package com.readlearncode.qualifiers.advanced;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Barcode(type = Barcode.Type.EAN8)
public class EAN8Barcode implements BarcodeGenerator {
    @Override
    public String generateBarcode() {
        return "EAN8: 94184600";
    }
}