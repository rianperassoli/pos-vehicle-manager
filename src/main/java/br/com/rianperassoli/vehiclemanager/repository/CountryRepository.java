package br.com.rianperassoli.vehiclemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rianperassoli.vehiclemanager.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
	
}
