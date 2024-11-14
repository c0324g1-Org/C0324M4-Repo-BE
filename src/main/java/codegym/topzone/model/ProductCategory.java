package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "product_category")
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    @OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
    private List<Product> products;
}
