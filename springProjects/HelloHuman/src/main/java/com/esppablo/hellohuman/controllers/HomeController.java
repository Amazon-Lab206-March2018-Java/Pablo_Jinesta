package com.esppablo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Create an ap that will render a page with either a default value of "human" or with the name provided in the URL query string.

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model, @RequestParam(value="name", defaultValue="Human") String name) {
    	
    	// Testing:
    	// http://127.0.0.1:8080/
    	// http://127.0.0.1:8080/?name=Pablo
    	
    	model.addAttribute("name", name);      
        return "index";
        
    }

}
