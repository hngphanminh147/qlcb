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
public class Assignment  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -399648863128408242L;
	@Id
	private String employeeId;
	@Id
	private String arrivalDate;
	@Id
	private String flightId;
}
