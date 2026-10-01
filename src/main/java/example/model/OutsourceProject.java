package example.model;
import javax.persistence.Entity;

@Entity
public class OutsourceProject extends Project {

    private String ownerName; //имя заказчика
}