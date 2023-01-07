package com.alisson.camadasormdto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisson.camadasormdto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
