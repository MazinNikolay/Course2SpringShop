package pro.sky.Course2SpringShop.service;

import java.util.List;

public interface ShopService {
    void addProduct(List<Integer> idProducts);

    List<Integer> getProducts();
}