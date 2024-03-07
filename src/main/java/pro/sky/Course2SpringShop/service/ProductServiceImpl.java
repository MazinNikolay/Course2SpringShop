package pro.sky.Course2SpringShop.service;

import org.springframework.stereotype.Service;
import pro.sky.Course2SpringShop.Exception.ProductNotFoundException;
import pro.sky.Course2SpringShop.model.Catalog;
import pro.sky.Course2SpringShop.model.Product;

import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final Catalog catalog;

    public ProductServiceImpl(Catalog catalog) {
        this.catalog = catalog;
    }
    @Override
    public boolean findProduct(int id) {
        return catalog.getCatalog().containsKey(id);
    }

    @Override
    public void addProduct(int id) {
        if (!findProduct(id)) {
            throw new ProductNotFoundException("Продукт не существует, повторите ввод");
        } else {
            catalog.basket.getProducts().add(catalog.getCatalog().get(id));
        }
    }

    @Override
    public List<Product> getProducts() {
        return Collections.unmodifiableList(catalog.basket.getProducts());
    }
}
