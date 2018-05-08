package com.esppablo.displaydate.controllers;
import java.util.Date;
import java.text.SimpleDateFormat;
// https://www.tutorialspoint.com/java/java_date_time.htm

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Create an app that will render three pages.

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
    	// Render one home page as the dashboard with links to the two others.
        return "index";
    }
    
    @RequestMapping("/date")
    public String date(Model model) {
    	// Render one page at /date with the current date formatted as Sunday, the 21 of May, 2017
    	Date date = new Date();
    	SimpleDateFormat dateFormat = new SimpleDateFormat ("EEEE, 'the' d 'of' MMMM, yyyy");
    	model.addAttribute("date", dateFormat.format(date));
        return "date";
    }
    
    @RequestMapping("/time")
    public String time(Model model) {
    	// Render one page at /time with the current time formatted as 11:30 PM
    	Date time = new Date();
    	SimpleDateFormat timeFormat = new SimpleDateFormat ("h:mm a");
    	model.addAttribute("time", timeFormat.format(time));
        return "time";
    }
    
}

