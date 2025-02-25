package org.example.a13_spring_boot.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class Orders {
    @Id
    private int orderId;
    @ManyToOne
    private Customer customer;
    private double total;
    @CreationTimestamp
    private Timestamp dateAndTime;


    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailList;

    public Orders() {
    }

    public Orders(int orderId, Customer customer, double total, Timestamp dateAndTime, List<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.customer = customer;
        this.total = total;
        this.dateAndTime = dateAndTime;
        this.orderDetailList = orderDetailList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Timestamp getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Timestamp dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", total=" + total +
                ", dateAndTime=" + dateAndTime +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
