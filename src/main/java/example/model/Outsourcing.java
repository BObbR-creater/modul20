package example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("outsourcing")
public class Outsourcing extends Employee {

    public String outsourceCompanyAddress;
}