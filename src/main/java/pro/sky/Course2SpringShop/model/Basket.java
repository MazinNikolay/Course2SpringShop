package pro.sky.Course2SpringShop.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.Course2SpringShop.Exception.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Product> products;
    private final Catalog catalog;

    public Basket(Catalog catalog) {
        this.products = new ArrayList<>();
        this.catalog = catalog;
    }

    public void addProduct(int id) {
        if (!catalog.getCatalog().containsKey(id)) {
            throw new ProductNotFoundException("Товар не существует");
        } else {
            products.add(catalog.getCatalog().get(id));
            System.out.println(catalog.getCatalog().get(id));
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}