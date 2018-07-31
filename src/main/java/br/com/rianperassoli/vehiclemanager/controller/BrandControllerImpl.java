package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Brand;
import br.com.rianperassoli.vehiclemanager.service.BrandService;
import br.com.rianperassoli.vehiclemanager.service.CountryService;

@Controller
@RequestMapping("/brand")
public class BrandControllerImpl implements BrandController{

	@Autowired
	BrandService brandService;
	
	@Autowired
	CountryService countryService;

	@Override
	@PostMapping("/save")
	public String save(Brand brand) {
		
		brandService.save(brand);
		
		return "redirect:/brand/list";
	}
	
	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		
		brandService.delete(id);
		
		return "redirect:/brand/list";
	}
	
	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("brand", brandService.findById(id));
		
		return "/brand/show";
	}
	
	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("brands", brandService.listBrand());

		return "brand/list";

	}
	
	@GetMapping("/new")
	public String novo(Brand brand, Model model) {
		model.addAttribute("countries", countryService.findAll());
		
		return "/brand/new";
	}

}
