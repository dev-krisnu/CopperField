package dev.krisnu.copperandsilicon.Repository;

import dev.krisnu.copperandsilicon.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {

}
