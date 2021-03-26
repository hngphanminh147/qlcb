package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Schedule {
	@Id
	private String arrivalDate;
	private String flightId;
	private String aircraftId;
	private int modelNum;
}
