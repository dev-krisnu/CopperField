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

    public Products updateProduct(Long id, Products products) {
        Products unchangedProduct = productRepository.findById(id).orElse(null);
        if (unchangedProduct != null) {
            unchangedProduct.setProductName(products.getProductName());
            unchangedProduct.setProductDescription(products.getProductDescription());
            unchangedProduct.setProductPrice(products.getProductPrice());
            unchangedProduct.setProductImageUrl(products.getProductImageUrl());
            unchangedProduct.setProductIndex(products.getProductIndex());
            unchangedProduct.setAvailability(products.getAvailability());
            return productRepository.save(unchangedProduct);
        }
        return null;
    }

    public List<Products> deleteAllProduct(){
        List<Products> receivedProduct =productRepository.findAll();
        productRepository.deleteAll();
        return receivedProduct;
    }

    public Optional<Products> deleteOneProduct(Long id){
        Optional<Products> receivedProduct =productRepository.findById(id);
        productRepository.deleteById(id);
        return receivedProduct;
    }
}
