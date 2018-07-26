package br.com.rianperassoli.vehiclemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car extends Vehicle{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private Long peopleCapacity;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPeopleCapacity() {
		return peopleCapacity;
	}

	public void setPeopleCapacity(Long peopleCapacity) {
		this.peopleCapacity = peopleCapacity;
	}
	
}
