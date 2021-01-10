package com.giovanni.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
