package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Flight implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1643867098378014459L;
	@Id
	private String id;
	private String departureAirport;
	private String destinationAirport;
	private String departureTime;
	private String arrivalTime;
}
