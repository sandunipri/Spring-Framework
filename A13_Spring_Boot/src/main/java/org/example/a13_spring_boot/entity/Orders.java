package org.example.a13_spring_boot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
public class Orders {
    @Id
    private int orderId;
    @ManyToOne
    private Customer customer;
    private double total;
    @CreationTimestamp
    private Timestamp dateAndTime;

    public Orders() {
    }

    public Orders(int orderId, Customer customer, double total, Timestamp dateAndTime) {
        this.orderId = orderId;
        this.customer = customer;
        this.total = total;
        this.dateAndTime = dateAndTime;
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

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", total=" + total +
                ", dateAndTime=" + dateAndTime +
                '}';
    }
}
