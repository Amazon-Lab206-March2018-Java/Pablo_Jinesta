package com.esppablo.loginregistration.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String register(@Valid @ModelAttribute("new_user") User user, BindingResult result, Model model, HttpSession session) {
    	userValidator.validate(user, result);
    	if(result.hasErrors()) {
    		return "index";
    	} else {
    		model.addAttribute("registrationMessage", "Registration Successful. Continue to login.");
    		if (userService.allUsers().size() == 0) {
    			userService.saveUserWithAdminRole(user);
    		} else {
    			userService.saveWithUserRole(user);
    		}
	        return "index";  	
    	}
    }
    
    // Allow admins to escalate non-admins to admin status
    @RequestMapping("/admin/make-admin/{id}")
    public String makeAdmin(@PathVariable("id") Long id) {
    	userService.makeAdmin(userService.findUserById(id));
    	return "redirect:/admin";
    }
    
    // Allow admins to delete non-admin accounts
    @RequestMapping("/admin/delete/{id}")
    public String deleteNonAdminUser(@PathVariable("id") Long id) {
    	userService.deleteUserById(id);
    	return "redirect:/admin";
    }
    
    // Create a dashboard page that is only accessible to logged in users
    @RequestMapping(value = {"/", "/dashboard"})
    public String dashboard(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "dashboard";
    }
    
    // Create a new admin dashboard page that shows all users
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        // Get current user (admin)
        model.addAttribute("currentUser", userService.findByUsername(username));
        // Get user by admin role
        model.addAttribute("admin", userService.findByRoleName("ROLE_ADMIN"));
        // Get all users (delete | make-admin)
        model.addAttribute("users", userService.allUsers());
        return "adminPage";
    }
    
    


}