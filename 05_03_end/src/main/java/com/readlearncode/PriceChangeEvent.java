package com.readlearncode;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PriceChangeEvent {

    private String stock;
    private float price;
    private float priceChange;

    public PriceChangeEvent(float price, float priceChange, String stock) {
        this.price = price;
        this.priceChange = priceChange;
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public float getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(float priceChange) {
        this.priceChange = priceChange;
    }
}