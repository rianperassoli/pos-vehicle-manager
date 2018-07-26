package br.com.rianperassoli.vehiclemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Long yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getChassisNumber() {
		return ChassisNumber;
	}

	public void setChassisNumber(Long chassisNumber) {
		ChassisNumber = chassisNumber;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
		
}
