package org.example.a13_spring_boot.service;

import org.example.a13_spring_boot.dto.CustomerDTO;
import org.example.a13_spring_boot.entity.Customer;
import org.example.a13_spring_boot.repo.CustomerRepo;
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
    public boolean saveCustomer(CustomerDTO customerDTO){
      /*  Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );*/
        customerRepo.save(modelMapper.map(customerDTO,Customer.class));
        return true;
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
    public boolean updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())){
            customerRepo.save(modelMapper.map(customerDTO,Customer.class));
            return true;
        }
        return true;
    }

    @Override
    public boolean deleteCustomer(int id) {
        customerRepo.deleteById(id);
        return customerRepo.existsById(id);
    }
}
