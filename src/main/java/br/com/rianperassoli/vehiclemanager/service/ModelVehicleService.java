package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import br.com.rianperassoli.vehiclemanager.model.ModelVehicle;

public interface ModelVehicleService {
	public void save(ModelVehicle model);
	public void delete(Long id);
	
	public ModelVehicle findById(Long id);
	public List<ModelVehicle> findAll();
}

