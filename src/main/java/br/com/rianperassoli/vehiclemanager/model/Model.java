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
public class Model {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private Double length;
	
	@Column
	private Double width;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Engine engine;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Brand brand;
	
}
