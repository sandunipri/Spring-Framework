package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getCustomers();
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(int id);

}
