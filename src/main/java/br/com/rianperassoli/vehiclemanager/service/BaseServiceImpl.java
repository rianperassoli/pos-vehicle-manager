package br.com.rianperassoli.vehiclemanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	JpaRepository<T, Long> jpaRepository;

	@Override
	public void save(T t) {
		jpaRepository.save(t);
	}

	@Override
	public T findById(Long id) {
		Optional<T> entity = jpaRepository.findById(id);

		return entity.isPresent() ? entity.get() : null;
	}

	@Override
	public List<T> findAll() {
		return jpaRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		jpaRepository.deleteById(id);
	}

}
