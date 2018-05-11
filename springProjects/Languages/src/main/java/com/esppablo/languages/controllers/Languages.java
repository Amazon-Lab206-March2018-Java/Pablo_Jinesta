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
	
    @RequestMapping("/{index}")
    public String findLanguageByIndex(Model model, @PathVariable("index") int index) {
        Language language = languageService.findLanguageByIndex(index);
        model.addAttribute("language", language);
        return "showLanguage";
    }
       
    @PostMapping("/")
    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "index"; 
        } else {
            // Add the language
        	languageService.addLanguage(language);
            return "redirect:/";
        }
    }
    
    @RequestMapping("/edit/{id}")
    public String editLanguage(@PathVariable("id") int id, Model model) {
    	Language language = languageService.findLanguageByIndex(id);
    	if (language != null) {
    		model.addAttribute("language", language);
    		return "editLanguage";
    	} else {
    		return "redirect:/";
    	}
    }
    
    @PostMapping("/edit/{id}")
    public String updateLanguage(@PathVariable("id") int id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "editLanguage";
        } else {
            languageService.updateLanguage(id, language);
            return "redirect:/" + id;
        }
    }
	
    @RequestMapping("/delete/{id}")
    public String destroyLanguage(@PathVariable("id") int id) {
        languageService.destroyLanguage(id);
        return "redirect:/";
    }

}
