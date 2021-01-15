package ru.netology.manager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void shouldAddOneItem() {
        ProductManager manager = new ProductManager();
        Book coreJava = new Book(1, "Core Java", 10, "Cay Horstmann", 1000, 2020);
        manager.add(coreJava);
        Product[] expected = new Product[] {coreJava};
        Product[] actual = manager.searchBy("Core Java");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearch() {
        ProductManager manager = new ProductManager();
        Book coreJava = new Book(1, "Core Java", 10, "Cay Horstmann", 1000, 2020);
        Book coreJava2 = new Book(3, "Core Java II", 20, "Cay Horstmann", 1700, 2021);
        Book testJava = new Book(2, "Test Java", 15, "Spock", 500, 2021);
        manager.add(coreJava);
        manager.add(testJava);
        manager.add(coreJava2);
        Product[] expected = new Product[]{coreJava, coreJava2};
        Product[] actual = manager.searchBy("Cay Horstmann");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldMatches() {
        ProductManager manager = new ProductManager();
        Book coreJava = new Book(1, "Core Java", 10, "Cay Horstmann", 1000, 2020);
        assertTrue(manager.matches(coreJava, "Core Java"));
        assertTrue(manager.matches(coreJava, "Cay Horstmann"));
        Smartphone iPhone = new Smartphone(1, "iPhone", 1000, "Apple");
        assertTrue(manager.matches(iPhone, "iPhone"));
        assertTrue(manager.matches(iPhone, "Apple"));
        assertFalse(manager.matches(iPhone, "Samsung"));
    }
}