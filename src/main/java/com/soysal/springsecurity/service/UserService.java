package com.soysal.springsecurity.service;

import com.soysal.springsecurity.domain.Role;
import com.soysal.springsecurity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
