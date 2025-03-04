package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.model.CartTm;

public interface PlaceOrderService {
    void getAllPlaceOrders();

    void placeOrder(CartTm cartTm);
}
