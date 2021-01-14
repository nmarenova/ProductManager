package netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BookTest {

    @Test
    public void shouldHaveAllMethodsFieldsFromSuper() {
        Book book = new Book();
    }

    @Test
    public void shouldUseEquals() {
        Book book1 = new Book(1, "N", 100, "A", 500, 2020);
        Book book2 = new Book(1, "N", 100, "A", 500, 2020);
        Book book3 = new Book(1, "N", 100, "A", 400, 2020);
        Book book4 = new Book(1, "N", 100, "B", 500, 2020);
        Book book5 = new Book(1, "N", 100, "A", 400, 2021);
        Book book6 = new Book(1, "N", 100, "A", 500, 2021);
        Book book7 = new Book(1, "N", 100, "B", 400, 2021);
        Book book8 = new Book(1, "N", 100, "B", 500, 2020);
        assertEquals(book1, book1);
        assertEquals(book1, book2);
        assertNotEquals(book1, book3);
        assertNotEquals(book1, book4);
        assertNotEquals(book1, book5);
        assertNotEquals(book1, book6);
        assertNotEquals(book1, book7);
        assertNotEquals(book1, book8);
        assertNotEquals(book1, null);
        assertNotEquals(book1, new Smartphone(2, "M", 200, "Z"));
        assertNotEquals(book1, new Product(3, "P", 300));
    }


}