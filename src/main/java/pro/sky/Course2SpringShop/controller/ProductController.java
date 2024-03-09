package pro.sky.Course2SpringShop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Course2SpringShop.Exception.ProductNotFoundException;
import pro.sky.Course2SpringShop.model.Product;
import pro.sky.Course2SpringShop.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleNotFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Товар не существует");
    }

    @GetMapping(path = "/get")
    public List<Product> getBasket() {
        return productService.getProducts();
    }

    @GetMapping(path = "/add")
    public void addProduct(@RequestParam("idList") ArrayList<Integer> idList) {
        productService.addProduct(idList);
    }
}