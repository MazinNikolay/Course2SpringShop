package pro.sky.Course2SpringShop.service;

import org.springframework.stereotype.Service;
import pro.sky.Course2SpringShop.model.Basket;
import pro.sky.Course2SpringShop.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final Basket basket;

    public ProductServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProduct(ArrayList<Integer> idList) {
        basket.addProduct(idList);
    }

    @Override
    public List<Product> getProducts() {
        return Collections.unmodifiableList(basket.getProducts());
    }
}