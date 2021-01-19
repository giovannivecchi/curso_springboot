package com.giovanni.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
