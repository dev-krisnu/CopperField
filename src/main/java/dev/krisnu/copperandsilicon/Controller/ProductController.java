package dev.krisnu.copperandsilicon.Controller;

import dev.krisnu.copperandsilicon.Entity.Products;
import dev.krisnu.copperandsilicon.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/api/products")

public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/postNewProduct")
    public ResponseEntity<Products> postNewProduct(Products products) {
        Products postedProduct=productService.postNewProduct(products);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(postedProduct);
    }
}
