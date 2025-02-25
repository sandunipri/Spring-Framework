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
    private List<OrderDetail> orderDetailslist;

    public Item() {
    }

    public Item(int code, int qty, String name, double price, List<OrderDetail> orderDetailslist) {
        this.code = code;
        this.qty = qty;
        this.name = name;
        this.price = price;
        this.orderDetailslist = orderDetailslist;
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

    public List<OrderDetail> getOrderDetailslist() {
        return orderDetailslist;
    }

    public void setOrderDetailslist(List<OrderDetail> orderDetailslist) {
        this.orderDetailslist = orderDetailslist;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", orderDetailslist=" + orderDetailslist +
                '}';
    }
}
