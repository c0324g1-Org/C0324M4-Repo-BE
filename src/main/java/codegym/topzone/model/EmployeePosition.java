package codegym.topzone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "employee_position")
@Data
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "positionName")
    private String positionName;

    @Column(name = "basicSalary")
    private Integer basicSalary;

    @OneToMany(mappedBy = "position", fetch = FetchType.LAZY)
    private  List<Employee> employees;
}
