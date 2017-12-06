package com.readlearncode.qualifiers.combine;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Barcode(type = Barcode.Type.EAN8)
@Language(locale = Language.Locale.SPANISH)
public class EAN8BarcodeES implements CodeGenerator {
    @Override
    public String generateCode() {
        return "EAN8: 94184600";
    }
}