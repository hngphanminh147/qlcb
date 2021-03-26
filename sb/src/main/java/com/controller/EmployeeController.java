package com.controller;

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

import com.model.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable(name = "id") String id) {
		Optional<Employee> e = service.findById(id);
		if (e.isEmpty()) {
			return ResponseEntity.badRequest().body("Please recheck the id!");
		}
		return ResponseEntity.ok(e.get());
	}
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody Employee employee){
		if (service.findById(employee.getId()).isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
					.body("User " + employee.getId() + " is already exsists.");
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
