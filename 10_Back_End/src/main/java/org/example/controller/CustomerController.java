package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    List<CustomerDTO> customerList = new ArrayList<>();

    @PostMapping(path = "save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerList.add(customerDTO);
        return customerDTO;
    }

    @PutMapping(path = "update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (int i = 0; i < customerList.size(); i++) {
            CustomerDTO existingCustomer = customerList.get(i);
            if (existingCustomer.getId().equals((customerDTO.getId()))) {
                existingCustomer.setName(customerDTO.getName());
                existingCustomer.setAddress(customerDTO.getAddress());
                customerDTO.setAddress(customerDTO.getAddress());
                return existingCustomer;
            }
        }
        return customerDTO;
    }

    @GetMapping(path = "getAll")
    public List<CustomerDTO> getAllCustomers(){
        return customerList;
    }

    @DeleteMapping(path = "delete/{id}")
    public boolean deleteCustomer(@PathVariable(value = "id") String id){
        for (int i = 0; i < customerList.size(); i++) {
            CustomerDTO existingCustomer = customerList.get(i);
            if (existingCustomer.getId().equals(id)) {
                customerList.remove(i);
               return true;
            }
        }
        return false;
    }


}
