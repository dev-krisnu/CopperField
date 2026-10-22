package dev.krisnu.copperandsilicon.Service;

import dev.krisnu.copperandsilicon.Entity.Products;
import dev.krisnu.copperandsilicon.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Products postNewProduct(Products products){
        return productRepository.save(products);
    }

    public List<Products> getAllProduct(){
        return productRepository.findAll();
    }

    public Optional<Products> getOneProduct(Long id){
        return productRepository.findById(id);
    }
}
