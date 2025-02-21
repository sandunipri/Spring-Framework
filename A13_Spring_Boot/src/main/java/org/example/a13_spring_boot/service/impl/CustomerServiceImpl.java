package org.example.a13_spring_boot.service.impl;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.repo.CustomerRepo;
import org.example.a13_spring_boot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void saveCustomer(CustomerDTO customerDTO){
      /*  Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );*/

        if (!customerRepo.existsById(customerDTO.getId())){
            customerRepo.save(modelMapper.map(customerDTO,Customer.class));
        }
        throw new RuntimeException("Customer already exist");
    }

    @Override
    public List<CustomerDTO> getCustomers() {
      /*  List<Customer> customers = customerRepo.findAll();
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
        return customerDTOs;*/
        return modelMapper.map(customerRepo.findAll(),new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())){
            customerRepo.save(modelMapper.map(customerDTO,Customer.class));
        }
        throw new RuntimeException("Customer does not Exists");
    }

    @Override
    public void deleteCustomer(int id) {
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }
        throw new RuntimeException("Customer does not Exists");
    }
}
