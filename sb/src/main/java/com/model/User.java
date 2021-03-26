package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "KHACHHANG")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4007988871498929431L;
	@Id
	@Column(name = "makh")	private String id;
	@Column(name = "ten")	private String name;
	@Column(name = "dchi")	private String address;
	@Column(name = "dthoai")	private String phone;
}
