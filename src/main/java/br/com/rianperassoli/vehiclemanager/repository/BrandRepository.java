package br.com.rianperassoli.vehiclemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rianperassoli.vehiclemanager.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{
	
}
