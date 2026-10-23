package dev.krisnu.copperandsilicon.Controller;

import dev.krisnu.copperandsilicon.Entity.Products;
import dev.krisnu.copperandsilicon.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api/products")

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/postNewProduct")
    public ResponseEntity<Products> postNewProduct(@RequestBody Products products) {
        Products postedProduct=productService.postNewProduct(products);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(postedProduct);
    }

    @GetMapping("/getAllProduct")
    public ResponseEntity<List<Products>> getAllProduct() {
        List<Products> receivedProduct =productService.getAllProduct();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(receivedProduct);
    }

    @GetMapping("/getOneProduct/{id}")
    public ResponseEntity<Optional<Products>> getOneProduct(@PathVariable Long id) {
        Optional<Products> receivedProduct =productService.getOneProduct(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(receivedProduct);
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<Products> UpdateProduct(@PathVariable Long id, @RequestBody Products products) {
        Products receivedProduct =productService.updateProduct(id,products);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(receivedProduct);
    }

    @DeleteMapping("/deleteAllProduct")
    public ResponseEntity<String> deleteAllProduct() {
        List<Products> receivedProduct =productService.deleteAllProduct();
        return ResponseEntity.ok().body("All Products deleted successfully");
    }

    @DeleteMapping("/deleteOneProduct/{id}")
    public ResponseEntity<String> deleteOneProduct(@PathVariable Long id) {
        Optional<Products> receivedProduct =productService.deleteOneProduct(id);
        return ResponseEntity.ok().body("Product " +id+ " deleted successfully");
    }

    @PatchMapping("/softDeleteAllProduct")
    public ResponseEntity<String> softDeleteAllProduct() {
         Boolean isDeleted =productService.softDeleteAllProduct();
        return ResponseEntity.ok()
                .body("All Products deleted successfully");
    }

    @PatchMapping("/softDeleteOneProduct/{id}")
    public ResponseEntity<String> softDeleteOneProduct(@PathVariable Long id) {
        Boolean isDeleted =productService.softDeleteOneProduct(id);
        return ResponseEntity.ok()
                .body("Product " +id+ "is deleted successfully");
    }
}
