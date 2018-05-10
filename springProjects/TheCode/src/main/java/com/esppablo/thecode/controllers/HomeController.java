package com.esppablo.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index(@ModelAttribute("errors") String errors) {
        return "index";
    }
    
    @RequestMapping("/thecode")
    public String thecode() {
        return "thecode";
    }
    
    @RequestMapping(path="/code", method=RequestMethod.POST)
    public String code(@RequestParam(value="code") String code) {
          
    	System.out.println("Code entered was: " + code);
    	
    	String thecode = "bushido";
    	System.out.println("The secret code is: " + thecode);

		if (code.equals(thecode)) {
			return "thecode";		
		} 
		else {		
			return "redirect:/errors";
		}		
    }

    @RequestMapping("/errors")
    public String errors(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("errors", "<div class=\"errors\">You must train harder!</div>");
        return "redirect:/";
    }

    
}
