package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Country;
import br.com.rianperassoli.vehiclemanager.service.CountryServiceImpl;

@Controller
@RequestMapping("/country")
public class CountryControllerImpl implements BaseController<Country> {

	@Autowired
	CountryServiceImpl countryServiceImpl;

	@Override
	@PostMapping("/save")
	public String save(Country country) {

		countryServiceImpl.save(country);

		return "redirect:/country/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		countryServiceImpl.delete(id);

		return "redirect:/country/list";
	}

	@Override
	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {

		model.addAttribute("country", countryServiceImpl.findById(id));

		return "/country/show";
	}

	@Override
	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("countries", countryServiceImpl.findAll());

		return "country/list";
	}

	@Override
	@GetMapping("/new")
	public String novo(Model model) {
		return "/country/new";
	}

}
