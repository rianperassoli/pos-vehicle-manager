package br.com.rianperassoli.vehiclemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rianperassoli.vehiclemanager.model.Brand;
import br.com.rianperassoli.vehiclemanager.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	BrandRepository brandRepository;
	
	@Override
	public void save(Brand brand) {
		brandRepository.save(brand);		
	}

}
