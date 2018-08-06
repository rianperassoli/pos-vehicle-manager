package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;

public interface BaseService<T> {
	public void save(T t);
	public void delete(Long id);
	
	public T findById(Long id);
	public List<T> findAll();	
}
