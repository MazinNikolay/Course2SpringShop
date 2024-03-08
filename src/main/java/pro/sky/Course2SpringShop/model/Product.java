package pro.sky.Course2SpringShop.model;

import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class Product {
    private String productName = "";

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return "productName='" + productName + '\'';
    }
}
