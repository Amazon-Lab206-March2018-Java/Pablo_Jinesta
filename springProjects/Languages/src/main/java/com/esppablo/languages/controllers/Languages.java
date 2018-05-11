package com.esppablo.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esppablo.languages.models.Language;
import com.esppablo.languages.services.LanguageService;


@Controller

public class Languages {

	private final LanguageService languageService;
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/")
	public String languages(Model model, @ModelAttribute("language") Language language) { 
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "index";
	}
	
    @RequestMapping("/{id}")
    public String findLanguageByIndex(Model model, @PathVariable("id") Long id) {
        model.addAttribute("language", languageService.findLanguageById(id));
        return "showLanguage";
    }
       
    @PostMapping("/add")
    public String createLanguage(Model model, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
        	model.addAttribute("languages", languageService.allLanguages());
            return "index"; 
        } else {
            // Add the language
        	languageService.addLanguage(language);
            return "redirect:/";
        }
    }
    
    @RequestMapping("/edit/{id}")
    public String editLanguage(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLanguageById(id);
    	if (language != null) {
    		model.addAttribute("language", language);
    		return "editLanguage";
    	} else {
    		return "redirect:/";
    	}
    }
    
    @PostMapping("/edit/{id}")
    public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "editLanguage";
        } else {
        	languageService.updateLanguage(language);
            return "redirect:/" + id;
        }
    }
	
    @RequestMapping("/delete/{id}")
    public String destroyLanguage(@PathVariable("id") Long id) {
        languageService.destroyLanguage(id);
        return "redirect:/";
    }

}
