package com.esppablo.loginregistration.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esppablo.loginregistration.models.User;
import com.esppablo.loginregistration.services.UserService;
import com.esppablo.loginregistration.validator.UserValidator;

@Controller
public class AppController {
    private UserService userService;
    private UserValidator userValidator;
    
    public AppController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
  

    // Allow users to login   
    @RequestMapping("/login")
    public String login_registration(@Valid @ModelAttribute("new_user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successful!");
        }
        return "index";
    }
    
    // Create an app that will allow users to register
    
    @PostMapping("/registration")
    public String register(@Valid @ModelAttribute("new_user") User user, BindingResult result, Model model, HttpSession sessio) {
    	userValidator.validate(user, result);
    	if(result.hasErrors()) {
    		return "index";
    	} else {
    		model.addAttribute("registrationMessage", "Registration Successful. Continue to login.");
	        userService.saveWithUserRole(user);
	        return "index";  	
    	}
    }
    
    // Create a dashboard page that is only accessible to logged in users
    @RequestMapping(value = {"/", "/dashboard"})
    public String dashboard(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "dashboard";
    }

}