package com.example;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ItemTest {

    @Test
    public void TestSomeItemMethod() {
        Item item = ItemFixture.withDefaults();
        assertFalse(item.getDescription().isEmpty());
    }

    @Test
    public void TestSomeOtherItemMethod() {
        Item item = new ItemFixture().withPrice(new BigDecimal("5")).build();
        assertEquals(new BigDecimal("5"), item.getPrice());
    }
}
