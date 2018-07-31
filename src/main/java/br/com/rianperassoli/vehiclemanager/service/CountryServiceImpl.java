package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rianperassoli.vehiclemanager.model.Country;
import br.com.rianperassoli.vehiclemanager.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public void save(Country country) {
		countryRepository.save(country);		
	}

	@Override
	public Country findById(Long id) {
		return countryRepository.findById(id).orElse(new Country());
	}

	@Override
	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		countryRepository.deleteById(id);		
	}

}
