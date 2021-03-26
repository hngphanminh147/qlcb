package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;

	public List<User> getAll() {
		return repo.findAll();
	}

	public Optional<User> getById(String id) {
		return repo.findById(id);
	}

	public User save(User user) {
		return repo.save(user);
	}

	public void deleteById(String id) throws IllegalArgumentException{
		repo.deleteById(id);
	}

}
