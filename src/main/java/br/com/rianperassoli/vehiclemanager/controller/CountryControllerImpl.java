package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Country;
import br.com.rianperassoli.vehiclemanager.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryControllerImpl implements CountryController {

	@Autowired
	CountryService countryService;

	@Override
	@PostMapping("/save")
	public String save(Country country) {

		countryService.save(country);

		return "redirect:/country/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		countryService.delete(id);

		return "redirect:/country/list";
	}

	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {

		model.addAttribute("country", countryService.findById(id));

		return "/country/show";
	}

	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("countries", countryService.findAll());

		return "country/list";
	}

	@GetMapping("/new")
	public String novo(Country country, Model model) {
		return "/country/new";
	}

}
