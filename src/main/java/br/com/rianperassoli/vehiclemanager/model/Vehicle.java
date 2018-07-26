package br.com.rianperassoli.vehiclemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private Long yearOfManufacture;
	
	@Column
	private String plate;
	
	@Column
	private String color;
	
	@Column
	private Long ChassisNumber;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Model model;
	
}
