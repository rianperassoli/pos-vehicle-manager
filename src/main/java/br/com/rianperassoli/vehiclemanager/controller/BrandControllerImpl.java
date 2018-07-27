package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Brand;
import br.com.rianperassoli.vehiclemanager.service.BrandService;

@Controller
@RequestMapping("/brand")
public class BrandControllerImpl implements BrandController{

	@Autowired
	BrandService brandService;

	@Override
	@PostMapping("/save")
	public String save(Brand brand) {
		
		brandService.save(brand);
		
		return "redirect:/";
	}
	
	@GetMapping("/new")
	public String novo(Brand brand) {
		
		
		return "/brand/new";
	}

}
