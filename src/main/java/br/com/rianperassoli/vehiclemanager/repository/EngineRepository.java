package br.com.rianperassoli.vehiclemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rianperassoli.vehiclemanager.model.Engine;

public interface EngineRepository extends JpaRepository<Engine, Long>{
	
}
