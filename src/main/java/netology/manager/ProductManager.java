package netology.manager;
import netology.domain.*;
import netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository productRepository = new ProductRepository();

    public void add(Product product) {
        productRepository.save(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product: productRepository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                // используйте System.arraycopy, чтобы скопировать всё из result в tmp
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;

    }

    public boolean matches(Product product, String search) {
        if (product.getName().equalsIgnoreCase(search)) {
            return true;
        }

        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }
        }

        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
            if (smartphone.getManufacturer().equalsIgnoreCase(search)) {
                return true;
            }
        }

        return false;
    }
}