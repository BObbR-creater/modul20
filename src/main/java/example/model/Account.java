package example.model;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "socialNetId")
    private SocialNetwork socialNet;

    public Account() {}

    public Account(Long id, String firstName, String lastName) {  //конструктор
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {  //гетттеры и сеттеры
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SocialNetwork getSocialNet() {
        return socialNet;
    }

    public void setSocialNet(SocialNetwork socialNet) {
        this.socialNet = socialNet;
    }

    @Override
    public String toString() {
        return "User { " +
                "id=" + id +
                ", firstName = " + firstName +
        ", lastName = " + lastName  + "}";
    }
}
