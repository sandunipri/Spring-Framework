package org.example.a13_spring_boot.service.impl;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.dto.OrderDetailDTO;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.entity.Item;
import org.example.a13_spring_boot.entity.OrderDetail;
import org.example.a13_spring_boot.entity.Orders;
import org.example.a13_spring_boot.repo.CustomerRepo;
import org.example.a13_spring_boot.repo.ItemRepo;
import org.example.a13_spring_boot.repo.OrderDetailsRepo;
import org.example.a13_spring_boot.repo.OrdersRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    private ModelMapper modelMapper;


}
