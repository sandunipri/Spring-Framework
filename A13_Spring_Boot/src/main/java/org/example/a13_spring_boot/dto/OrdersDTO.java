package org.example.a13_spring_boot.dto;


import jakarta.persistence.*;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.entity.OrderDetail;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

public class OrdersDTO {

    private int orderId;

    private Customer customer;

    private Timestamp dateAndTime;
    private List<OrderDetail> orderDetailList;

    public OrdersDTO() {
    }

    public OrdersDTO(int orderId, Customer customer, Timestamp dateAndTime, List<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.customer = customer;
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
                ", dateAndTime=" + dateAndTime +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
