package com.cityxpoint.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cityxpoint.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByUsername(String username);
}
