package org.example.a13_spring_boot.service.impl;

import org.example.a13_spring_boot.repo.CustomerRepo;
import org.example.a13_spring_boot.repo.ItemRepo;
import org.example.a13_spring_boot.repo.OrderDetailsRepo;
import org.example.a13_spring_boot.repo.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderServiceImpl {
    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private OrderDetailsRepo orderDetailsRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private CustomerRepo customerRepo;






}
