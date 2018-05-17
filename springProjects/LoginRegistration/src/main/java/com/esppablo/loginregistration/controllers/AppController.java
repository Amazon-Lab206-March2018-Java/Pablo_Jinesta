package com.esppablo.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esppablo.loginregistration.models.User;
import com.esppablo.loginregistration.services.UserService;

@Controller
public class AppController {
    private UserService userService;
    
    public AppController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login_registration(@Valid @ModelAttribute("new_user") User user) {
        return "index";
    }
    
    @RequestMapping(value = {"/", "/dashboard"})
    public String dashboard(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "dashboard";
    }
    
    @PostMapping("/registration")
    public String register(@Valid @ModelAttribute("new_user") User user, BindingResult result, Model model, HttpSession sessio) {
    	if(result.hasErrors()) {
    		return "index";
    	} else {
            userService.saveWithUserRole(user);
            return "redirect:/login";  		
    	}
    }
    


    
}