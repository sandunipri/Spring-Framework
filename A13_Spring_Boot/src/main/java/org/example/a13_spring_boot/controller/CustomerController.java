package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.service.impl.CustomerServiceImpl;
import org.example.a13_spring_boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(path = "save")
    public ResponseUtil getCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseUtil(201, "customer is saved", null);
    }

    @GetMapping(path = "get")
    public ResponseUtil getCustomer() {
        return new ResponseUtil(200, "success", customerService.getCustomers());
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
        return new ResponseUtil(200, "Customer is updated", null);
    }

    @DeleteMapping(path = "delete", params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam(value = "id") int id) {
        System.out.println(id);
        customerService.deleteCustomer(id);
        return new ResponseUtil(200, "Customer is deleted", null);
    }
}
