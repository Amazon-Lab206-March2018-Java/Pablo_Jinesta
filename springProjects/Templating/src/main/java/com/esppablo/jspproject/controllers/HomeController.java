package com.esppablo.jspproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }
	
    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("dojoName", "Burbank");
        return "index";
    }
}
