package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "bill_status")
@Data
public class BillStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "billStatus")
    private List<Bill> bills;
}
