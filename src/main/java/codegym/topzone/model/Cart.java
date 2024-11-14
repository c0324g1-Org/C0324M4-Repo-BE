package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "cart")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @Column(name = "totalCart")
    private Integer totalCart;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;
}
