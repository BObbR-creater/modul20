package example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department extends HeaderDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee> employees;

}
