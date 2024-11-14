package codegym.topzone.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_size")
public class ProductSize {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @Column(name = "size")
    private Integer size;

    @Column(name = "unitPrice")
    private Integer unitPrice;
}
