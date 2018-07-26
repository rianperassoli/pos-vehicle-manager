package br.com.rianperassoli.vehiclemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@Column
	private Long horsePower;
	
	@Column
	private Long liter;
	
	@Column
	private Long displacements;
	
	@Column
	private Long valves;
	
	@Column
	private String fuel;

	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Long horsePower) {
		this.horsePower = horsePower;
	}

	public Long getLiter() {
		return liter;
	}

	public void setLiter(Long liter) {
		this.liter = liter;
	}

	public Long getDisplacements() {
		return displacements;
	}

	public void setDisplacements(Long displacements) {
		this.displacements = displacements;
	}

	public Long getValves() {
		return valves;
	}

	public void setValves(Long valves) {
		this.valves = valves;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
