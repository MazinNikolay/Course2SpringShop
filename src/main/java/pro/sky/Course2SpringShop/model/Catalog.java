package pro.sky.Course2SpringShop.model;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
public class Catalog {
    private Map<Integer, Product> catalog;

    public Catalog() {
        catalog = Map.of(1, new Product("Молоко"),
                2, new Product("Хлеб"),
                3, new Product("Тапки"),
                4, new Product("Марс"),
                5, new Product("Подписка Яндекс музыка"),
                6, new Product("Плейстейшн"));
    }

    public Map<Integer, Product> getCatalog() {
        return Collections.unmodifiableMap(catalog);
    }
}