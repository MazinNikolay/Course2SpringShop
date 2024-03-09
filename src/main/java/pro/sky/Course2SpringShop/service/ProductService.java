package pro.sky.Course2SpringShop.service;

import pro.sky.Course2SpringShop.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    void addProduct(ArrayList<Integer> idList);

    List<Product> getProducts();
}