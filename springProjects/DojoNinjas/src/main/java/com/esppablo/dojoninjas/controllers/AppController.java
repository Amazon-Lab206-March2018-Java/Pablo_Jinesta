package com.esppablo.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esppablo.dojoninjas.models.Dojo;
import com.esppablo.dojoninjas.models.Ninja;
import com.esppablo.dojoninjas.services.DojoService;
import com.esppablo.dojoninjas.services.NinjaService;

@Controller
public class AppController {
	
	// Services
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	// Constructor
	public AppController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}

	@RequestMapping("/")
	public String index() { 
		return "redirect:/dojos/new";
	}
	
	// Allow users to create a new dojo.
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) { 
		return "newDojo";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo";
		} else {
			dojoService.addDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	// Have a dojo show page show information of all the ninjas that belong to that specific location.
	@RequestMapping("/dojos/{id}")
	public String newDojo(@PathVariable("id") Long id, Model model) { 
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "showDojo";
	}
	
	// Allow new ninjas to choose their dojo via a dropdown
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) { 
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "newNinja";
		} else {
			ninjaService.addNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
}
