package pro.sky.Course2SpringShop.service;

import pro.sky.Course2SpringShop.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(int id);

    List<Product> getProducts();
}