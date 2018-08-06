package br.com.rianperassoli.vehiclemanager.controller;

import br.com.rianperassoli.vehiclemanager.model.ModelVehicle;

public interface ModelVehicleController {
	
	public String delete(Long id);
	public String save(ModelVehicle model);
}
