package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    boolean saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getCustomers();
    boolean updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(int id);

}
