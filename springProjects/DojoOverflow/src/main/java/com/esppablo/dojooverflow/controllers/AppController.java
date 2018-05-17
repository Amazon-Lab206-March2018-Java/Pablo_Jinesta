package com.esppablo.dojooverflow.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;

import javax.validation.Valid;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esppablo.dojooverflow.models.QuestionModel;
import com.esppablo.dojooverflow.services.QuestionService;

// StackOverflow / Quora clone. Users will be able to create questions, answers, and add tag subjects for the questions.

@Controller
public class AppController {

	@RequestMapping("/")
	public String index() { 
		return "redirect:/questions";
	}
	
	// Have the question dashboard display each question and their tags.
	@RequestMapping("/questions")
	public String dashboard() {
		return "dashboard";
	}
	
	// Allow users to create questions with tags and implement validation errors.
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("new_question") QuestionModel question, @ModelAttribute("error") String error) {
		return "newQuestion";
	}	
	
	@PostMapping("/questions/new")
	public String createQuestion(@Valid @ModelAttribute("new_question") Question question, BindingResult result, @RequestParam("tag_list") String tag_list, Model model) {
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "newQuestion";
		} 
		ArrayList<String> tags = QuestionService.validate(tag_list, question);
		if (tags.contains("error")){
			model.addAttribute("error", "Enter comma-separated values and no more than 3 tags.");			
			return "newQuestion";
		}
		for(String tag : tags) {
			if (tagService.findTagBySubject(tag) == null) {
				
			}
		}
	}
	
	// Have the question show page display all the answers for that specific questions.
	@RequestMapping("/questions/{id}")
	public String showQuestion(@PathVariable("id") Long id) {
		return "showQuestion";
	}	

	// Allow users to answer questions and implement validation errors.
	@PostMapping("/questions/{id}/answer")
	public String addAnswer() {
		return "";
	}

}
