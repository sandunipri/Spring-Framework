package org.example.a13_spring_boot.entity;

import jakarta.persistence.*;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderDetailId;

    @ManyToOne
    private Orders orders;

    @ManyToOne
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(int orderDetailId, Orders orders, Item item) {
        this.orderDetailId = orderDetailId;
        this.orders = orders;
        this.item = item;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
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
                "orderDetailId=" + orderDetailId +
                ", orders=" + orders +
                ", item=" + item +
                '}';
    }
}
