package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

@Entity
@Table(name = "bill_item")
@Data
public class BillItem {
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "billId")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @Column(name = "quantity")
    private int quantity;
}
