package com.esppablo.license.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esppablo.license.models.License;
import com.esppablo.license.models.Person;
import com.esppablo.license.services.LicenseService;
import com.esppablo.license.services.PersonService;

// Allow users to create a new person with their first name and last name

@Controller
public class AppController {
	
	// services
	private final PersonService personService;
	private final LicenseService licenseService;
	
	// constructor
	public AppController(PersonService personService, LicenseService licenseService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}

	@RequestMapping("/")
	public String index() { 
		return "redirect:/persons/new";
	}
	
	// Allow users to create a new person with their first name and last name
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) { 
		return "newPerson";
	}
	
	@PostMapping("/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "newPerson";
		} else {
			personService.addPerson(person);
			return "redirect:/licenses/new";
		}
	}
	
	// Allow users to create a license with the state and expiration date; however the license number is done by the server. 
	// The first person in the DB has a license number of 000001. 
	// Increment by 1 every time a new person is added.
	
	@RequestMapping("/licenses/new")
	public String newLicense(Model model, @ModelAttribute("license") License license) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "newLicense";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "newLicense";
		} else {
			String licenseNumber = String.format("%06d", licenseService.allLicenses().size() + 1);
			license.setNumber(licenseNumber);
			licenseService.addLicense(license);
			return "showDriverLicense";
		}
	}
	
	// Have a person's show page that will retrieve their name, license number, license state, and license expiration date
	@RequestMapping("/persons/{id}")
	public String showDriverLicense(@PathVariable("id") Long id, Model model) {
		License license = licenseService.findDriverByID(id);
		model.addAttribute("license", license);
		return "showDriverLicense";
	}
}
