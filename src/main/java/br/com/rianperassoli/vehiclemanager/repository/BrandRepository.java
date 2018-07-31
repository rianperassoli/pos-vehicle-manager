package br.com.rianperassoli.vehiclemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rianperassoli.vehiclemanager.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{
	@Query("select b from Brand b left join fetch b.nationality")
	List<Brand> listBrand();
}
