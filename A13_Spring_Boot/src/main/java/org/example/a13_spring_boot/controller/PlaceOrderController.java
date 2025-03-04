package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.dto.OrdersDTO;
import org.example.a13_spring_boot.model.CartTm;
import org.example.a13_spring_boot.service.PlaceOrderService;
import org.example.a13_spring_boot.service.impl.PlaceOrderServiceImpl;
import org.example.a13_spring_boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/placeOrder")
@CrossOrigin
public class PlaceOrderController {
    @Autowired
    private PlaceOrderService placeOrderService;

    @GetMapping
    public ResponseUtil getAllPlaceOrders(){
        placeOrderService.getAllPlaceOrders();
        return new ResponseUtil(200, "Orders Found", null);
    }

    @PostMapping(path = "placeOrder")
    public ResponseUtil placeOrder(@RequestBody CartTm cartTm){
        placeOrderService.placeOrder(cartTm);
        return new ResponseUtil(200, "Order Placed Successfully", null);
    }

}
