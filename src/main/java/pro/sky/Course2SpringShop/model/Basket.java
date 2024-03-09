package pro.sky.Course2SpringShop.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(List<Integer> idProducts) {
        idProducts.forEach(e -> products.add(e));
    }

    public List<Integer> getProducts() {
        return Collections.unmodifiableList(products);
    }
}