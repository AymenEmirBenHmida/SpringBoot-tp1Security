package com.SpringSecurity.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.demo.entite.User;

public interface UserRepository extends JpaRepository<User, Long> {

User findByUsername(String username);

}