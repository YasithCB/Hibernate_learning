package lk.thogakade.hibernatePart.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class OrderDetail implements Serializable {
    @ManyToOne @Id
    private Orders orders;

    @ManyToOne @Id
    private Item item;

    private int qty;
    @CreationTimestamp
    private Date date;


    public OrderDetail() {
    }

    public OrderDetail(Orders orders, Item item, int qty) {
        this.orders = orders;
        this.item = item;
        this.qty = qty;
    }

    public OrderDetail(Orders orders, Item item, int qty, Date date) {
        this.orders = orders;
        this.item = item;
        this.qty = qty;
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Orders getOrder() {
        return orders;
    }

    public void setOrder(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                ", qty=" + qty +
                ", date=" + date +
                ", order=" + orders +
                ", item=" + item +
                '}';
    }
}
