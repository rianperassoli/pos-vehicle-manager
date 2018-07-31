package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;
import java.util.Optional;

import br.com.rianperassoli.vehiclemanager.model.Country;

public interface CountryService {
	public void save(Country country);
	public Optional<Country> findById(Long id);
	public List<Country> findAll();
}

