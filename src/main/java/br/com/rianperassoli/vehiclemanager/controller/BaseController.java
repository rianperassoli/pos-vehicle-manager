package br.com.rianperassoli.vehiclemanager.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public interface BaseController<T> {
	public String save(T t);

	public String delete(Long id);

	public String visualizar(@PathVariable("id") Long id, Model model);

	public String listar(Model model);

	public String novo(Model model);
}
