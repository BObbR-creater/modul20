package example.model;
import example.Customer;

import javax.persistence.*;

@Entity
public class PhysicalCustomer extends Customer {

    private String dataOfBirth;
    private String location;
    private String phone;
}