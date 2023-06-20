package com.example.appBackend.security.services;

import com.example.appBackend.security.entities.Role;
import com.example.appBackend.security.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface AccountServices {
    User createUser(String username,String password,String email,String confirmPassword);
    Role createRole(String role);
    void addRoletoUser(String username,String role);
    void removeRolefromUSer(String username,String role);
    User loadUserByUsername(String username);
    
}
