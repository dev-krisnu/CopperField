package dev.krisnu.copperandsilicon.Service;

import dev.krisnu.copperandsilicon.Entity.Products;
import dev.krisnu.copperandsilicon.Repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service

public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Products postNewProduct(Products products){
        Products newProduct=productRepository.save(products);
        return newProduct;
    }
}
