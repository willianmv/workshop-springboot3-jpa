package com.simpleapi.example.repositories;

import com.simpleapi.example.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
