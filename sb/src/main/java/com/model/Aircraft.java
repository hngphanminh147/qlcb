package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MAYBAY")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aircraft implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8540519337383617648L;
	@Id
	private String id;
	private int modelNum;
}
