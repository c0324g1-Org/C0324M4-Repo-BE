package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bill")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "totalBill")
    private Integer totalBill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status")
    private BillStatus billStatus;

    @Column(name = "createAt")
    private LocalDateTime createAt;

    @OneToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(mappedBy = "bill")
    private List<BillItem> billItems;
}
