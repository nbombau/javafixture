package com.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private long id;

    private BigDecimal totalAmount;

    private List<Item> items;

    private LocalDateTime date;

    public Order(long id, BigDecimal totalAmount, List<Item> items, LocalDateTime date) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.items = items;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public List<Item> getItems() {
        return items;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
