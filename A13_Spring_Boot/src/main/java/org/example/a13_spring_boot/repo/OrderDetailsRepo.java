package org.example.a13_spring_boot.repo;

import org.example.a13_spring_boot.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepo extends JpaRepository<OrderDetail,Integer> {
}
