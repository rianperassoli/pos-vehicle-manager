package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import br.com.rianperassoli.vehiclemanager.model.Brand;

public interface BrandService {
	public void save(Brand brand);
	public void delete(Long id);
	
	public Brand findById(Long id);
	public List<Brand> listBrand();	
}
