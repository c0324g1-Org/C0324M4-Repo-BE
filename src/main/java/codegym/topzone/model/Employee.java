package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phoneNumber", unique = true)
    private String phoneNumber;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "address")
    private String address;

    @Column(name = "citizenId", unique = true)
    private String citizenId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "positionId", nullable = false)
    private EmployeePosition position;
}
