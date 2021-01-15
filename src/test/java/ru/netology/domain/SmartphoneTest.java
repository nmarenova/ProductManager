package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    public void shouldHaveAllMethodsFieldsFromSuper() {
        Smartphone smartphone = new Smartphone();
    }

    @Test
    public void shouldUseEquals() {
        Smartphone smartphone1 = new Smartphone(1, "N", 100, "A");
        Smartphone smartphone2 = new Smartphone(1, "N", 100, "A");
        Smartphone smartphone3 = new Smartphone(1, "N", 100, "B");
        assertEquals(smartphone1, smartphone1);
        assertEquals(smartphone1, smartphone2);
        assertNotEquals(smartphone1, smartphone3);
        assertNotEquals(smartphone1, null);
        assertNotEquals(smartphone1, new Smartphone(2, "M", 200, "Z"));
        assertNotEquals(smartphone1, new Product(3, "P", 300));
    }
}