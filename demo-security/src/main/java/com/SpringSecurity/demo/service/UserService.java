package com.SpringSecurity.demo.service;

import com.SpringSecurity.demo.entite.Role;
import com.SpringSecurity.demo.entite.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}