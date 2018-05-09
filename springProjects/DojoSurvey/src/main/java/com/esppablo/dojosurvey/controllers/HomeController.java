package com.esppablo.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// Create a 2 page app that will allow clients to fill out a form and see the form results.

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";      
    }
    
    @RequestMapping(path="/survey", method=RequestMethod.POST)
    public String survey(Model model, HttpSession session, 
    		@RequestParam(value="name") String name, 
    		@RequestParam(value="location")String location,
    		@RequestParam(value="fav_language")String fav_language,
    		@RequestParam(value="comment")String comment) {
    	session.setAttribute("name", name);
    	session.setAttribute("location", location);
    	session.setAttribute("fav_language", fav_language);
    	session.setAttribute("comment", comment);
    	return "redirect:/results";      
    }
    
    @RequestMapping("/results")
    public String results(Model model, HttpSession session) {
    	model.addAttribute("name", session.getAttribute("name"));
    	model.addAttribute("location", session.getAttribute("location"));
    	model.addAttribute("fav_language", session.getAttribute("fav_language"));
    	model.addAttribute("comment", session.getAttribute("comment"));
    	return "results";      
    }
    
}
