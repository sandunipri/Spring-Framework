package org.example.a13_spring_boot.dto;


import org.example.a13_spring_boot.entity.Customer;

import java.sql.Timestamp;

public class OrdersDTO {

    private int orderId;
    private Customer customer;
    private double total;
    private Timestamp dateAndTime;

    public OrdersDTO() {
    }

    public OrdersDTO(int orderId, Customer customer, double total, Timestamp dateAndTime) {
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
