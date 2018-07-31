package br.com.rianperassoli.vehiclemanager.controller;

import br.com.rianperassoli.vehiclemanager.model.Country;

public interface CountryController {
	
	public String delete(Long id);
	public String save(Country country);
}
