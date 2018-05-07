package com.example;

import java.math.BigDecimal;

public class Item {

    private String description;

    private BigDecimal price;

    private int quantity;

    public Item(String description, BigDecimal price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
