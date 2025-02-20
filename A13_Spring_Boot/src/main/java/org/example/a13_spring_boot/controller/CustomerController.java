package org.example.a13_spring_boot.controller;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(path = "save")
    public Boolean getCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res = customerService.saveCustomer(customerDTO);
        return res;
    }

    @GetMapping(path = "get")
    public List<CustomerDTO> getCustomer() {
        return customerService.getCustomers();
    }

    @PutMapping
    public Boolean updateCustomer(@RequestBody CustomerDTO customerDTO) {
       boolean response = customerService.updateCustomer(customerDTO);
       return response;
    }

    @DeleteMapping(path = "delete", params = {"id"})
    public boolean deleteCustomer(@RequestParam(value = "id") int id){
        System.out.println(id );
        return customerService.deleteCustomer(id);
    }


}
