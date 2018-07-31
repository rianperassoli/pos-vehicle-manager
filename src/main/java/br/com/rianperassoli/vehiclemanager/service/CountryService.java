package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import br.com.rianperassoli.vehiclemanager.model.Country;

public interface CountryService {
	public void save(Country country);
	public void delete(Long id);
	
	public Country findById(Long id);
	public List<Country> findAll();
}

