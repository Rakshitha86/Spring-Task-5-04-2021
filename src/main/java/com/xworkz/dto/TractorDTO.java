package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tractor_table")
public class TractorDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRACTOR_ID")
	private int id;

	@Column(name = "TRACTOR_MODEL")
	private String model;

	@Column(name = "TRACTOR_COST")
	private double cost;

	@Column(name = "TRACTOR_COLOR")
	private String color;

	@Column(name = "TRACTOR_FUELCAPACITY")
	private int fuelCapacity;

	@Column(name = "TRACTOR_TRACTORCAPACITY")
	private int tractorCapacity;

	@Column(name = "TRACTOR_MILAGE")
	private int milage;

	public TractorDTO(String model, double cost, String color, int fuelCapacity, int tractorCapacity, int milage) {
		super();
		this.model = model;
		this.cost = cost;
		this.color = color;
		this.fuelCapacity = fuelCapacity;
		this.tractorCapacity = tractorCapacity;
		this.milage = milage;
	}

}
