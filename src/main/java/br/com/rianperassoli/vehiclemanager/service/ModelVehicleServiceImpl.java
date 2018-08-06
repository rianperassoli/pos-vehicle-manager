package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rianperassoli.vehiclemanager.model.ModelVehicle;
import br.com.rianperassoli.vehiclemanager.repository.ModelVehicleRepository;

@Service
public class ModelVehicleServiceImpl implements ModelVehicleService{

	@Autowired
	ModelVehicleRepository modelRepository;
	
	@Override
	public void save(ModelVehicle model) {
		modelRepository.save(model);		
	}

	@Override
	public ModelVehicle findById(Long id) {
		return modelRepository.findById(id).orElse(new ModelVehicle());
	}

	@Override
	public List<ModelVehicle> findAll() {
		return modelRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		modelRepository.deleteById(id);		
	}

}
