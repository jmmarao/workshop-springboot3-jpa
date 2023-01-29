package com.educandoweb.workshopspringboot3jpa.services;

import com.educandoweb.workshopspringboot3jpa.entities.Order;
import com.educandoweb.workshopspringboot3jpa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order findOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

    public List<Order> findOrders() {
        return orderRepository.findAll();
    }
}
