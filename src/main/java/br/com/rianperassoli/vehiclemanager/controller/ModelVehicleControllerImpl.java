package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.ModelVehicle;
import br.com.rianperassoli.vehiclemanager.service.BrandServiceImpl;
import br.com.rianperassoli.vehiclemanager.service.EngineServiceImpl;
import br.com.rianperassoli.vehiclemanager.service.ModelVehicleServiceImpl;

@Controller
@RequestMapping("/modelVehicle")
public class ModelVehicleControllerImpl implements BaseController<ModelVehicle> {

	@Autowired
	ModelVehicleServiceImpl modelVehicleServiceImpl;

	@Autowired
	BrandServiceImpl brandServiceImpl;

	@Autowired
	EngineServiceImpl engineServiceImpl;

	@Override
	@PostMapping("/save")
	public String save(ModelVehicle modelVehicle) {

		modelVehicleServiceImpl.save(modelVehicle);

		return "redirect:/modelVehicle/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		modelVehicleServiceImpl.delete(id);

		return "redirect:/modelVehicle/list";
	}

	@Override
	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {
		model.addAttribute("engines", engineServiceImpl.findAll());
		model.addAttribute("brands", brandServiceImpl.findAll());

		model.addAttribute("modelVehicle", modelVehicleServiceImpl.findById(id));

		return "/modelVehicle/show";
	}

	@Override
	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("modelVehicles", modelVehicleServiceImpl.findAll());
		model.addAttribute("engines", engineServiceImpl.findAll());
		model.addAttribute("brands", brandServiceImpl.findAll());

		return "modelVehicle/list";
	}

	@Override
	@GetMapping("/new")
	public String novo(Model model) {
		model.addAttribute("engines", engineServiceImpl.findAll());
		model.addAttribute("brands", brandServiceImpl.findAll());

		return "/modelVehicle/new";
	}

}
