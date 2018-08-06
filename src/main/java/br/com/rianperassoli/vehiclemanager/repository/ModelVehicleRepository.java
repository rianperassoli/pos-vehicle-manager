package br.com.rianperassoli.vehiclemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rianperassoli.vehiclemanager.model.ModelVehicle;

public interface ModelVehicleRepository extends JpaRepository<ModelVehicle, Long>{
	
}
