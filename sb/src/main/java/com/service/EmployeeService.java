package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
	
	public Optional<Employee> findById(String id) throws IllegalArgumentException{
		return repo.findById(id);
	}
	
	public List<Employee> findAll(){
		return repo.findAll();
	}
	
	public void deleteById(String id) throws IllegalArgumentException{
		repo.deleteById(id);
	}
}
