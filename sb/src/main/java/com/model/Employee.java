package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "NHANVIEN")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
	private static final long serialVersionUID = 4969426478357468757L;
	@Id
	@Column(name = "MANV")
	private String id;
	@Column(name = "TEN")
	private String name;
	@Column(name = "DCHI")
	private String address;
	@Column(name = "DTHOAI")
	private String phone;
	@Column(name = "luong")
	private int salary;
	@Column(name = "loainv")
	private int type;
}
