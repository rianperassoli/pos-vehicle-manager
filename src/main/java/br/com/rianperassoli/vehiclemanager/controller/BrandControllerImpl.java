package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Brand;
import br.com.rianperassoli.vehiclemanager.service.BrandServiceImpl;
import br.com.rianperassoli.vehiclemanager.service.CountryServiceImpl;

@Controller
@RequestMapping("/brand")
public class BrandControllerImpl implements BaseController<Brand> {

	@Autowired
	BrandServiceImpl brandServiceImpl;

	@Autowired
	CountryServiceImpl countryServiceImpl;

	@Override
	@PostMapping("/save")
	public String save(Brand brand) {

		brandServiceImpl.save(brand);

		return "redirect:/brand/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		brandServiceImpl.delete(id);

		return "redirect:/brand/list";
	}

	@Override
	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {

		model.addAttribute("countries", countryServiceImpl.findAll());
		model.addAttribute("brand", brandServiceImpl.findById(id));

		return "/brand/show";
	}

	@Override
	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("brands", brandServiceImpl.findAll());

		return "brand/list";

	}

	@Override
	@GetMapping("/new")
	public String novo(Model model) {
		model.addAttribute("countries", countryServiceImpl.findAll());

		return "/brand/new";
	}

}
