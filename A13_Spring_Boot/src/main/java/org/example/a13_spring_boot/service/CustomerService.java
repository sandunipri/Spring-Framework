package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean saveCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );
        customerRepo.save(customer);
        return true;
    }

/*    public List<CustomerDTO> getCustomers() {
        List<Customer> customers = customerRepo.findAll();
        return customers.stream().map(customer -> {
            return new CustomerDTO(
                    customer.getId(),
                    customer.getName(),
                    customer.getAddress()
            );
        }).toList();
    }*/

    public List<CustomerDTO> getCustomers() {
        List<Customer> customers = customerRepo.findAll();
        List<CustomerDTO> customerDTOs = new ArrayList<>();
        for (Customer customer : customers) {
            customerDTOs.add(
                    new CustomerDTO(
                            customer.getId(),
                            customer.getName(),
                            customer.getAddress()
                    )
            );
        }
        return customerDTOs;
    }

    public boolean updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())){
            Customer customer = new Customer(
                    customerDTO.getId(),
                    customerDTO.getName(),
                    customerDTO.getAddress()
            );
            customerRepo.save(customer);
            return true;
        }
        return true;
    }

    public boolean deleteCustomer(int id) {
        customerRepo.deleteById(id);
        return customerRepo.existsById(id);
    }
}
