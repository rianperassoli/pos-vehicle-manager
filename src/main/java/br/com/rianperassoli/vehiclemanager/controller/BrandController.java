package br.com.rianperassoli.vehiclemanager.controller;

import br.com.rianperassoli.vehiclemanager.model.Brand;

public interface BrandController {
	public String save(Brand brand);

	String delete(Long id);
}
