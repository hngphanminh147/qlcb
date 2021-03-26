package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2877460004626541761L;
	@Id
	private String passengerId;
	private String arrivalDate;
	private String flightId;
}
