package com.esppablo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Create a brand new Spring Boot application for your portfolio assignment

// Have 3 pages

@Controller
public class PortalController {
    @RequestMapping("/")
    public String index() {
    	// Home Page
        return "forward:/index.html";
    }
    
    @RequestMapping("/projects")
    public String projects() {
    	// Projects Page
        return "forward:/projects.html";
    }
    
    @RequestMapping("/me")
    public String about() {
    	// About me Page
        return "forward:/about.html";
    }
    
}