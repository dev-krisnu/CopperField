package dev.krisnu.copperandsilicon.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Products {

    @Id
    private Long id;

    private String productName;
    private String productDescription;
    private String productPrice;
    private String productImageUrl;
    private Long productIndex;
    private Reviews reviews;
}
