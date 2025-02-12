package com.simpleapi.example.repositories;

import com.simpleapi.example.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
