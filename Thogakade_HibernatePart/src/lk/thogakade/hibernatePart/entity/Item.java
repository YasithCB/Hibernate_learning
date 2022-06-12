package lk.thogakade.hibernatePart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    private String iId;
    private String description;
    private double price;
    private int qtyOnHand;

    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Item() {
    }

    public Item(String iId) {
        this.iId = iId;
    }

    public Item(String iId, String description, double price, int qtyOnHand) {
        this.iId = iId;
        this.description = description;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
    }

    public Item(String iId, String description, double price, int qtyOnHand, List<OrderDetail> orderDetailList) {
        this.iId = iId;
        this.description = description;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
        this.orderDetailList = orderDetailList;
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "iId='" + iId + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", qtyOnHand=" + qtyOnHand +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
