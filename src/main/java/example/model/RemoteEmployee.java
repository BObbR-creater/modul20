package example.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("remote_employee")
public class RemoteEmployee extends Employee {
    private String ipAddress;

}