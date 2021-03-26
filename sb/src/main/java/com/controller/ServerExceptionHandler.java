package com.controller;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ServerExceptionHandler {

	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("NoSuchElementException: " + ex.getMessage());
	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<String> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<String> tem(){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found");
	}
}
