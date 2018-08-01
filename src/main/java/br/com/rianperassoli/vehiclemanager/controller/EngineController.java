package br.com.rianperassoli.vehiclemanager.controller;

import br.com.rianperassoli.vehiclemanager.model.Engine;

public interface EngineController {
	
	public String delete(Long id);
	public String save(Engine engine);
}
