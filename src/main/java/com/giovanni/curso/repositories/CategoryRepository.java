package com.giovanni.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
