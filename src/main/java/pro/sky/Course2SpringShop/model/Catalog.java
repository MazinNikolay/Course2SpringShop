package pro.sky.Course2SpringShop.model;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
public class Catalog {
    private final Map<Integer, Product> catalog;

    public Catalog() {
        catalog = Map.of(001, new Product("Молоко"),
                002, new Product("Хлеб"),
                003, new Product("Тапки"),
                004, new Product("Марс"),
                005, new Product("Подписка Яндекс музыка"),
                006, new Product("Плейстейшн"));
    }

    public Map<Integer, Product> getCatalog() {
        return Collections.unmodifiableMap(catalog);
    }
}