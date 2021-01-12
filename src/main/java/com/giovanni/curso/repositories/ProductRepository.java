package com.giovanni.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
