package example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;
}