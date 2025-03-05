package org.example.a13_spring_boot.service.impl;

import jakarta.transaction.Transactional;
import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.dto.ItemDTO;
import org.example.a13_spring_boot.dto.OrderDetailDTO;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.entity.Item;
import org.example.a13_spring_boot.entity.OrderDetail;
import org.example.a13_spring_boot.entity.Orders;
import org.example.a13_spring_boot.model.CartTm;
import org.example.a13_spring_boot.repo.CustomerRepo;
import org.example.a13_spring_boot.repo.ItemRepo;
import org.example.a13_spring_boot.repo.OrderDetailsRepo;
import org.example.a13_spring_boot.repo.OrdersRepo;
import org.example.a13_spring_boot.service.PlaceOrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {
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


    @Override
    public void getAllPlaceOrders() {
        OrderDetail orderDetail =
                orderDetailsRepo.findById(1).orElseThrow(() ->
                        new RuntimeException("OrderDetail not found"));

    }

    @Override
    public void placeOrder(CartTm cartTm) {
        CustomerDTO customerDTO = cartTm.getCustomerDTO();
        List<ItemDTO> itemDTOS = cartTm.getItemDTOS();


        //update qty
        for (ItemDTO itemDTO : itemDTOS){
            Item items = itemRepo.findById(itemDTO.getCode()).orElseThrow(() ->
                    new RuntimeException("Item not found"));
            items.setQty(items.getQty() - itemDTO.getQty());
            itemRepo.save(items);
        }

        Orders orders = new Orders();
        orders.setCustomer(modelMapper.map(customerDTO, Customer.class));
        orders.setDateAndTime(new Timestamp(System.currentTimeMillis()));

        ordersRepo.save(orders);
        ordersRepo.flush();

        for (ItemDTO itemDTO : itemDTOS){
            Item item = modelMapper.map(itemDTO, Item.class);
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrders(orders);
            orderDetail.setItem(item);
            orderDetailsRepo.save(orderDetail);

        }
    }
}
