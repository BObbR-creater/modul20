package example.model;

import javax.persistence.*;

@MappedSuperclass
public class HeaderDepartment {

    public long managerId;
    private String name;

}
