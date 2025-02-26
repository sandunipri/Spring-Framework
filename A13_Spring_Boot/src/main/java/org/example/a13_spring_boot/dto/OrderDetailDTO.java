package org.example.a13_spring_boot.dto;

import org.example.a13_spring_boot.entity.Item;
import org.example.a13_spring_boot.entity.Orders;

public class OrderDetailDTO {

    private int orderDetailId;

    private Orders orders;

    private Item item;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int orderDetailId, Orders orders, Item item) {
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
        return "OrderDetailDTO{" +
                "orderDetailId=" + orderDetailId +
                ", orders=" + orders +
                ", item=" + item +
                '}';
    }
}
