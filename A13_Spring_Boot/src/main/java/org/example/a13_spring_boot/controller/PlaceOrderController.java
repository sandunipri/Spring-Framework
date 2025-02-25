package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.service.impl.PlaceOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/placeOrder")
@CrossOrigin
public class PlaceOrderController {
    @Autowired
    private PlaceOrderServiceImpl placeOrderServiceImpl;




}
