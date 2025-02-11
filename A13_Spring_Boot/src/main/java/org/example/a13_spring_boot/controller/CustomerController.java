package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "save")
    public Boolean getCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res = customerService.saveCustomer(customerDTO);
        return res;
    }

    @GetMapping(path = "get")
    public List<CustomerDTO> getCustomer() {
        return customerService.getCustomers();
    }
}
