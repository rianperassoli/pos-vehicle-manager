package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rianperassoli.vehiclemanager.model.Engine;
import br.com.rianperassoli.vehiclemanager.service.EngineServiceImpl;

@Controller
@RequestMapping("/engine")
public class EngineControllerImpl implements BaseController<Engine> {

	@Autowired
	EngineServiceImpl engineServiceImpl;

	@Override
	@PostMapping("/save")
	public String save(Engine engine) {

		engineServiceImpl.save(engine);

		return "redirect:/engine/list";
	}

	@Override
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		engineServiceImpl.delete(id);

		return "redirect:/engine/list";
	}

	@Override
	@GetMapping("/show/{id}")
	public String visualizar(@PathVariable("id") Long id, Model model) {

		model.addAttribute("engine", engineServiceImpl.findById(id));

		return "/engine/show";
	}

	@Override
	@GetMapping("/list")
	public String listar(Model model) {
		model.addAttribute("engines", engineServiceImpl.findAll());

		return "engine/list";
	}

	@Override
	@GetMapping("/new")
	public String novo(Model model) {
		return "/engine/new";
	}

}
