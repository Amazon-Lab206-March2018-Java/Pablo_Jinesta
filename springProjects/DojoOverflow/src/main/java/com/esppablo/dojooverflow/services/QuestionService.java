package com.esppablo.dojooverflow.services;
import org.springframework.stereotype.Service;

import com.esppablo.dojooverflow.models.QuestionModel;
import com.esppablo.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	private QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	// add question and tags
	public void addQuestion(QuestionModel question) {
		questionRepository.save(question);
	}
}
