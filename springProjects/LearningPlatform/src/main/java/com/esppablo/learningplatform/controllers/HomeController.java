package com.esppablo.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
    	return "index";
    }
    
    // You should have only two methods, one for the lessons and one for the assignments. 
    // What url path part identifies lessons vs assignments?

    // lesson.jsp
	@RequestMapping("/m/{chapter}/0553/{lessonNumber}")
    public String showLesson(@PathVariable("chapter") int chapter, @PathVariable("lessonNumber") int lessonNumber){
		return "lesson";
	}
	
	// assignment.jsp
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
    public String showAssignment(@PathVariable("chapter") int chapter, @PathVariable("assignmentNumber") int assignmentNumber){
		return "assignment";
	}

}
