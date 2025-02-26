package org.example.a13_spring_boot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Item {
    @Id
    private int code;
    private String name;
    private int qty;
    private double price;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailsList;

    public Item() {
    }

    public Item(int code, String name, int qty, double price, List<OrderDetail> orderDetailsList) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.orderDetailsList = orderDetailsList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderDetail> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetail> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}
