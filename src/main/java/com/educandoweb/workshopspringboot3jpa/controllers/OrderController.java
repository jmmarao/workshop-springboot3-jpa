package com.educandoweb.workshopspringboot3jpa.controllers;

import com.educandoweb.workshopspringboot3jpa.entities.Order;
import com.educandoweb.workshopspringboot3jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findOrderByIdController(@PathVariable Long id) {
        return ResponseEntity.ok().body(orderService.findOrderById(id));
    }

    @GetMapping
    public ResponseEntity<List<Order>> findOrdersController() {
        return ResponseEntity.ok().body(orderService.findOrders());
    }
}
