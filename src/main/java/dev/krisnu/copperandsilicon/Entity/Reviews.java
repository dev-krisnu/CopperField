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

public class Reviews {
    @Id
    private Long reviewId;

    private Long productReviewIndex;
    private Byte stars;
    private String review;
    private Long userId;
    private String username;
    private String userImage;
    private String userEmail;

}
