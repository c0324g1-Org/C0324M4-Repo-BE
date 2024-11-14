package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_image")
@Data
public class ProductImage {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "imageName")
    private String imageName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @Column(name = "isShow")
    private boolean is_show;
}
