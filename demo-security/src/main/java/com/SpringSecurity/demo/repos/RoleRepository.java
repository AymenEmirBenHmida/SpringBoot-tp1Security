package com.SpringSecurity.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.demo.entite.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}