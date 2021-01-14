package netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ProductTest {
    @Test
    public void shouldUseEquals() {
        Product product1 = new Product(1, "Java I", 1000);
        Product product2 = new Product(1, "Java I", 1000);
        Product product3 = new Product(2, "Java I", 1000);
        Product product4 = new Product(1, "Java II", 1000);
        Product product5 = new Product(1, "Java I", 2000);
        Product product6 = new Product(2, "Java II", 1000);
        Product product7 = new Product(1, "Java II", 2000);
        Product product8 = new Product(2, "Java II", 2000);
        assertEquals(product1, product1);
        assertEquals(product1, product2);
        assertNotEquals(product1, product3);
        assertNotEquals(product1, product4);
        assertNotEquals(product1, product5);
        assertNotEquals(product1, product6);
        assertNotEquals(product1, product7);
        assertNotEquals(product1, product8);
        assertNotEquals(product1, null);
        assertNotEquals(product1, new Smartphone(2, "M", 200, "Z"));
    }
}