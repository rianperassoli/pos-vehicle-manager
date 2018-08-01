package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import br.com.rianperassoli.vehiclemanager.model.Engine;

public interface EngineService {
	public void save(Engine engine);
	public void delete(Long id);
	
	public Engine findById(Long id);
	public List<Engine> findAll();
}

