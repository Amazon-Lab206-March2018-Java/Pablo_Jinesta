package com.esppablo.loginregistration.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esppablo.loginregistration.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
//	User findByUsername(String username);
	User findByEmail(String email);
}
