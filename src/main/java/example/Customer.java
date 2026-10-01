package example;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Customer {

    @Id
    private Long id;
    private String name;
}