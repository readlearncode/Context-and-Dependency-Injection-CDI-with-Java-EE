package com.readlearncode.loosecoupling;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BootStrap {

    public static void main(String... args) {

        System.out.println("------------------------------------------------");
        Product book = new Product("Book");

        ProductService productService = new ProductService(new EAN13Barcode());
        productService.generateCode(book);
        System.out.println(book.getCode());

        productService = new ProductService(new EAN5Barcode());
        productService.generateCode(book);
        System.out.println(book.getCode());

        productService = new ProductService(new EAN8Barcode());
        productService.generateCode(book);
        System.out.println(book.getCode());

        System.out.println("------------------------------------------------");

    }
}