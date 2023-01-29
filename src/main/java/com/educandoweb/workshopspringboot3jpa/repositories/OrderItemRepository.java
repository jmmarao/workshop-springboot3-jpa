package com.educandoweb.workshopspringboot3jpa.repositories;

import com.educandoweb.workshopspringboot3jpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
