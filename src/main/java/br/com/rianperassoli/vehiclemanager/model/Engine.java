package br.com.rianperassoli.vehiclemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
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
	
}
