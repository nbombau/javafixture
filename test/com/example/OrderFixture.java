package com.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.now;
import static java.util.Arrays.asList;

public class OrderFixture {

    private long id = 1101l;

    private BigDecimal totalAmount = new BigDecimal(6000002.97);

    private List<Item> items = asList(ItemFixture.withDefaults(), new ItemFixture().withDescription("Another expensive item").build());

    private LocalDateTime date = now();

    public OrderFixture withTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public OrderFixture withTotalAmount(List<Item> items) {
        this.items = items;
        return this;
    }

    public Order build() {
        return new Order(id, totalAmount, items, date);
    }

    public static Order withDefaults() {
        return new OrderFixture().build();
    }

}
