package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	public Optional<User> findById(String id);

	public void deleteById(String id);
}
