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
@Table(name="loaimb")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AircraftManufacturer  implements Serializable{
	private static final long serialVersionUID = 5270235737265693219L;
	@Id
	@Column(name = "maloai")
	private String id;
	@Column(name = "hangsx")
	private String name;
}
