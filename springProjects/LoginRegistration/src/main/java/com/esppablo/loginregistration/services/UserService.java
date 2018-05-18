package com.esppablo.loginregistration.services;

import java.util.Date;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.esppablo.loginregistration.models.Role;
import com.esppablo.loginregistration.models.User;
import com.esppablo.loginregistration.repositories.RoleRepository;
import com.esppablo.loginregistration.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder)     {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    public void saveWithUserRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_USER"));
        userRepository.save(user);
    }
     
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }    
    
    // find by user name
    public User findByUsername(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find admin by role name
    public Role findByRoleName(String role) {
    	return roleRepository.findByName(role).get(0);
    }
    
    // return all users
    public List<User> allUsers(){
    	return userRepository.findAll();
    }
    
    // make-admin
    public void makeAdmin(User user) {
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }
    
    // Save
    public void save(User user) {
    	userRepository.save(user);
    }
    	
    
}