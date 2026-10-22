package dev.krisnu.copperandsilicon.Repository;

import dev.krisnu.copperandsilicon.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Products,Long> {

}
