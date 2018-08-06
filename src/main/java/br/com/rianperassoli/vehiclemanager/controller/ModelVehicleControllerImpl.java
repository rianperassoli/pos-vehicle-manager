package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.ModelVehicle;
import br.com.rianperassoli.vehiclemanager.service.BrandService;
import br.com.rianperassoli.vehiclemanager.service.EngineService;
import br.com.rianperassoli.vehiclemanager.service.ModelVehicleService;

@Controller
@RequestMapping("/modelVehicle")
public class ModelVehicleControllerImpl implements ModelVehicleController {

	@Autowired
	ModelVehicleService modelVehicleService;
	
	@Autowired
	BrandService brandService;
	
	@Autowired
	EngineService engineService;

	@Override
	@PostMapping("/save")
	public String save(ModelVehicle modelVehicle) {

		modelVehicleService.save(modelVehicle);

		return "redirect:/modelVehicle/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		modelVehicleService.delete(id);

		return "redirect:/modelVehicle/list";
	}

	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {
		model.addAttribute("engines", engineService.findAll());
		model.addAttribute("brands", brandService.listBrand());
		
		model.addAttribute("modelVehicle", modelVehicleService.findById(id));

		return "/modelVehicle/show";
	}

	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("modelVehicles", modelVehicleService.findAll());
		model.addAttribute("engines", engineService.findAll());
		model.addAttribute("brands", brandService.listBrand());

		return "modelVehicle/list";
	}

	@GetMapping("/new")
	public String novo(Model model) {
		model.addAttribute("engines", engineService.findAll());
		model.addAttribute("brands", brandService.listBrand());

		return "/modelVehicle/new";
	}

}
