package com.esppablo.ninjagoldgame.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
    @SuppressWarnings("rawtypes")
	@RequestMapping("/")
    public String index(HttpSession session) {
    	// Start with 0 gold.
		if (session.getAttribute("activitieslog") == null) {
			session.setAttribute("gold", 0);
			ArrayList<Map> activitieslog = new ArrayList<Map>();
			session.setAttribute("activitieslog", activitieslog);
		}

		return "index";
	}
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(path="/process_money", method=RequestMethod.POST)
    public String process_money(HttpSession session, @RequestParam(value="building") String building) {
    	
    	Random random = new Random();
    	int gold = (int) session.getAttribute("gold");
    	
    	ArrayList<Map> activitieslog = new ArrayList<Map>();
    	activitieslog = (ArrayList<Map>) session.getAttribute("activitieslog");
        Map<String,String> message = new HashMap<String,String>();
    	
		// September 3rd 2016 6:15pm
        Date date = new Date();
    	SimpleDateFormat datetimeFormat = new SimpleDateFormat ("MMMM d yyyy h:mm a");
    	String datetime = datetimeFormat.format(date);
    		  
    	int min = 0;
    	int max = 0;
        switch (building) {
        	// farm - add 10 - 20 to gold
	        case "farm":
	        	min = 10;
	        	max = 20;
	        	break;
	        // cave - add 5-10 to gold
	        case "cave":
	        	min = 5;
	        	max = 10;
	        	break;
	        // house - add 2-5 to gold
	        case "house":
	        	min = 2;
	        	max = 5;
	        	break;
	        // casino - add or remove 0-50 to gold
	        case "casino":
	        	min = -50;
	        	max = 50;
	        	break;
	    }
        int earnings = random.nextInt(max +1 -min) + min;
        
        // Log: Keep a log including the timestamp for each submission.
        if(earnings > 0) {
        	gold += earnings;
        	message.put("message", "You entered a " + building + " and earned "+ earnings + " gold. (" + datetime + ")");
        	message.put("color", "green");
        	activitieslog.add(message);
        } else {
        	earnings = Math.abs(earnings);
        	gold -= earnings;
        	message.put("message", "You entered a casino and lost " + earnings + " gold. Ouch. (" + datetime + ")");
        	message.put("color", "red");
        	activitieslog.add(message);
        }
        
    	gold += earnings;
    	session.setAttribute("gold", gold);
    	session.setAttribute("activitieslog", activitieslog);
    	return "redirect:/";      
    }      
    
    // Create a reset button
    @RequestMapping("/reset")
    public String reset(HttpSession session) {
    	session.removeAttribute("gold");
    	session.removeAttribute("activitieslog");
    	return "redirect:/";
    }
}
