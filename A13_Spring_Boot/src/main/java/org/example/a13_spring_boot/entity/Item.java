package org.example.a13_spring_boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private int code;
    private String name;
    private int qty;
    private double price;

    public Item() {
    }

    public Item(int code, String name, int qty, double price) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
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

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
