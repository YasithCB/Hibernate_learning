package lk.thogakade.hibernatePart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private
    String cId;
    private String name;
    private String contact;
    private String city;

    @OneToMany(mappedBy = "customer")
    private List<Orders> ordersList = new ArrayList<>();

    public Customer() {
    }

    public Customer(String cId) {
        this.cId = cId;
    }

    public Customer(String cId, String name, String contact, String city) {
        this.cId = cId;
        this.name = name;
        this.contact = contact;
        this.city = city;
    }

    public Customer(String cId, String name, String contact, String city, List<Orders> ordersList) {
        this.cId = cId;
        this.name = name;
        this.contact = contact;
        this.city = city;
        this.ordersList = ordersList;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Orders> getOrderList() {
        return ordersList;
    }

    public void setOrderList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId='" + cId + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", city='" + city + '\'' +
                ", orderList=" + ordersList +
                '}';
    }
}
