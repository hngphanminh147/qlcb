package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	@Autowired
	UserService service;

	@GetMapping("/")
	public List<User> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name = "id") String id) {
		Optional<User> u = service.getById(id);
		if (u.isPresent()) {
			return ResponseEntity.ok(u.get());
		}
		return ResponseEntity.badRequest().body("User not found. Please recheck the id!");
	}

	@PostMapping("/")
	public ResponseEntity<Object> save(@RequestBody User user) {
		if (service.getById(user.getId()).isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
					.body("User " + user.getId() + " is already exsists.");
		}
		return ResponseEntity.ok("Create successfully");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable(name = "id") String id) {
		try {
			service.deleteById(id);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body("Id can not be null!");
		}
		return ResponseEntity.ok("Delete successfully!");
	}
}
