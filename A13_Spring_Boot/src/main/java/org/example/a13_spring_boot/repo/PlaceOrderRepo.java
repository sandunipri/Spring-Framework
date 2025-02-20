package org.example.a13_spring_boot.repo;

import org.example.a13_spring_boot.entity.PlaceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceOrderRepo extends JpaRepository<PlaceOrder, Integer> {
}
