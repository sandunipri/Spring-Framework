package org.example.a13_spring_boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private int orderId;
    @ManyToOne
    private Orders orders;
    @ManyToOne
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(int orderId, Orders orders, Item item) {
        this.orderId = orderId;
        this.orders = orders;
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
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
                "orderId=" + orderId +
                ", orders=" + orders +
                ", item=" + item +
                '}';
    }
}
