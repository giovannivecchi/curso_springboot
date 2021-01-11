package com.giovanni.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
