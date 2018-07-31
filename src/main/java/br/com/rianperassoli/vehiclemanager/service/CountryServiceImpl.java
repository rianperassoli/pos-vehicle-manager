package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;
import java.util.Optional;

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
	public Optional<Country> findById(Long id) {
		return countryRepository.findById(id);
	}

	@Override
	public List<Country> findAll() {
		return countryRepository.findAll();
	}

}
