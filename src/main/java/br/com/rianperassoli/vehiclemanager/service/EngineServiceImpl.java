package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rianperassoli.vehiclemanager.model.Engine;
import br.com.rianperassoli.vehiclemanager.repository.EngineRepository;

@Service
public class EngineServiceImpl implements EngineService{

	@Autowired
	EngineRepository engineRepository;
	
	@Override
	public void save(Engine engine) {
		engineRepository.save(engine);		
	}

	@Override
	public Engine findById(Long id) {
		return engineRepository.findById(id).orElse(new Engine());
	}

	@Override
	public List<Engine> findAll() {
		return engineRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		engineRepository.deleteById(id);		
	}

}
