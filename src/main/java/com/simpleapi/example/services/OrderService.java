package com.simpleapi.example.services;

import com.simpleapi.example.entities.Order;
import com.simpleapi.example.entities.User;
import com.simpleapi.example.repositories.OrderRepository;
import com.simpleapi.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }

}
