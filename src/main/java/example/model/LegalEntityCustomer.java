package example.model;
import example.Customer;

import javax.persistence.*;

@Entity
public class LegalEntityCustomer extends Customer {

    private String INN;
    private String address;

}