package org.example.a13_spring_boot.dto;

import org.example.a13_spring_boot.entity.Item;
import org.example.a13_spring_boot.entity.Orders;

public class OrderDetailDTO {

    private int orderId;

    private Orders orders;

    private Item item;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int orderId, Orders orders, Item item) {
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
