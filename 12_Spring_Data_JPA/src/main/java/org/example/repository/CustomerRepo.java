package org.example.repository;

import org.example.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Override
    List<Customer> findAllById(Iterable<Integer> integers);
}
