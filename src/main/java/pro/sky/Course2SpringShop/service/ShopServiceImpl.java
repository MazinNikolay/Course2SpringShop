package pro.sky.Course2SpringShop.service;

import org.springframework.stereotype.Service;
import pro.sky.Course2SpringShop.model.Basket;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    private final Basket basket;

    public ShopServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProduct(List<Integer> idProducts) {
        basket.addProduct(idProducts);
    }

    @Override
    public List<Integer> getProducts() {
        return basket.getProducts();
    }
}