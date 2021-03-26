package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "khanang")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ability {
	@Id
	@Column(name = "manv")
	private String employeeId;
	@Id
	@Column(name = "maloai")
	private String manufacturorId;
}
