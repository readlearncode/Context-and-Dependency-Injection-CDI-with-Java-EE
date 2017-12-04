package com.readlearncode.qualifiers.Combine;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Barcode(type = Barcode.Type.EAN13)
public class EAN13Barcode implements BarcodeGenerator {
    @Override
    public String generateBarcode() {
        return "EAN13: 9780735200449";
    }
}