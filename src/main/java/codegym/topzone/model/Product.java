package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productCategoryId", nullable = false)
    private ProductCategory productCategory;
    private Integer ram;
    private String description;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String informationSystem;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductImage> productImages;

    @OneToMany(mappedBy = "product")
    private List<ProductSize> productSizes;

    private boolean isShow;
}
