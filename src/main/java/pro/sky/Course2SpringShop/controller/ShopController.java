package pro.sky.Course2SpringShop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Course2SpringShop.service.ShopService;

import java.util.List;

@RestController
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping(path = "/get")
    public List<Integer> getBasket() {
        return shopService.getProducts();
    }

    @GetMapping(path = "/add")
    public void addProduct(@RequestParam("id") List<Integer> id) {
        shopService.addProduct(id);
    }
}