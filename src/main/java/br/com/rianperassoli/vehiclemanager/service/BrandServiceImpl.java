package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

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

	@Override
	public Brand findById(Long id) {
		return brandRepository.findById(id).orElse(new Brand());
	}

	@Override
	public List<Brand> listBrand() {
		return brandRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		brandRepository.deleteById(id);
	}

}
