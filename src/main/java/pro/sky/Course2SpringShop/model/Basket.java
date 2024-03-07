package pro.sky.Course2SpringShop.model;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
public class Basket {
    private final List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
}
