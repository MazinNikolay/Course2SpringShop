package pro.sky.Course2SpringShop.service;

import org.springframework.stereotype.Service;
import pro.sky.Course2SpringShop.model.Basket;
import pro.sky.Course2SpringShop.model.Product;

import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final Basket basket;

    public ProductServiceImpl() {
        this.basket = new Basket();
    }

    @Override
    public void addProduct(int id) {
        basket.addProduct(id);
    }

    @Override
    public List<Product> getProducts() {
        return Collections.unmodifiableList(basket.getProducts());
    }
}