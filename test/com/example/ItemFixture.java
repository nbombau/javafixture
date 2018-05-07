package com.example;

import java.math.BigDecimal;

public class ItemFixture {

    private String description = "This is an expensive item";

    private BigDecimal price = new BigDecimal(1000000.99);

    private int quantity = 3;

    public ItemFixture withDescription(String description) {
        this.description = description;
        return this;
    }

    public ItemFixture withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Item build() {
        return new Item(description, price, quantity);
    }

    public static Item withDefaults() {
        return new ItemFixture().build();
    }
}
