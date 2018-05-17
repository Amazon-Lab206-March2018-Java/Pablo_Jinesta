package com.esppablo.dojooverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="questions")
public class QuestionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column
	@Size(min = 10, max=145)
	private String question;

	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	@OneToMany(mappedBy="question", fetch=FetchType.LAZY)
	private List<AnswerModel> answers;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "tag_questions",
			joinColumns = @JoinColumn(name = "question_id"),
			inverseJoinColumns  = @JoinColumn(name = "tag_id")
	)
	public List<TagModel> tags;
	
	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
	
	public QuestionModel() {
		
	}
	
    // getters and setters 
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<TagModel> getTags() {
		return tags;
	}

	public void setTags(List<TagModel> tags) {
		this.tags = tags;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerModel> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerModel> answers) {
		this.answers = answers;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
