package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Engine;
import br.com.rianperassoli.vehiclemanager.service.EngineService;

@Controller
@RequestMapping("/engine")
public class EngineControllerImpl implements EngineController {

	@Autowired
	EngineService engineService;

	@Override
	@PostMapping("/save")
	public String save(Engine engine) {

		engineService.save(engine);

		return "redirect:/engine/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		engineService.delete(id);

		return "redirect:/engine/list";
	}

	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {

		model.addAttribute("engine", engineService.findById(id));

		return "/engine/show";
	}

	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("engines", engineService.findAll());

		return "engine/list";
	}

	@GetMapping("/new")
	public String novo() {
		return "/engine/new";
	}

}
