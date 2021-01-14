package netology.repository;

import netology.domain.Smartphone;
import org.junit.jupiter.api.Test;
import netology.domain.Book;
import netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    @Test
    public void shouldSaveOneItem() {
        ProductRepository repository = new ProductRepository();
        Book coreJava = new Book();
        repository.save(coreJava);
        Product[] expected = new Product[] {coreJava};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindItemById() {
        ProductRepository repository = new ProductRepository();
        Smartphone iPhone = new Smartphone(1, "iPhone", 1000, "Apple");
        repository.save(iPhone);
        Product expected = iPhone;
        Product actual = repository.findById(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindItemById() {
        ProductRepository repository = new ProductRepository();
        Smartphone iPhone = new Smartphone();
        repository.save(iPhone);
        Product expected = null;
        Product actual = repository.findById(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemoveItemById() {
        ProductRepository repository = new ProductRepository();
        Book coreJava = new Book(1, "Core Java", 10, "Cay Horstmann", 1000, 2020);
        Book testJava = new Book(2, "Test Java", 15, "Spock", 500, 2021);
        repository.save(coreJava);
        repository.save(testJava);
        repository.removeById(1);
        Product[] expected = new Product[] {testJava};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }


}