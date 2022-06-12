package lk.thogakade.hibernatePart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String oId;

    @ManyToOne
    private
    Customer customer;

    @OneToMany(mappedBy = "orders")
    private
    List<OrderDetail> orderDetailList = new ArrayList<>();

    public Orders() {
    }

    public Orders(String oId, Customer customer) {
        this.oId = oId;
        this.customer = customer;
    }

    public Orders(String oId, Customer customer, List<OrderDetail> orderDetailList) {
        this.oId = oId;
        this.customer = customer;
        this.orderDetailList = orderDetailList;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId='" + oId + '\'' +
                ", customer=" + customer +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
