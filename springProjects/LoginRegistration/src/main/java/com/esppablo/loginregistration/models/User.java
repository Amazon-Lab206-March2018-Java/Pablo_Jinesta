package com.esppablo.loginregistration.models;

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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	// Validate email
	@Column
	@Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
	private String email;
	
	//	@Column
	//	@Size(min=1, max=25)
	//	private String username;
	
	// Validate first and last name (>0 characters)
	@Column
	@Size(min=1, max=25, message="First Name is required")
	private String firstName;
	
	@Column
	@Size(min=1, max=25, message="Last Name is required")
	private String lastName;
	 
	// Validate passwords (matching >= 10 characters)
	@Column
	@Size(min=10, message="Password must be greater than 10 characters")
	private String password;
	 
	@Transient
	private String passwordConfirmation;
	 
	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;

	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
	 
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	name = "users_roles", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	 
	public User() {
		 
	}
	 
	public Long getId() {
	    return id;
	}	 
	public void setId(Long id) {
	    this.id = id;
	}	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getUsername() {
//	    return username;
//	}
//	public void setUsername(String username) {
//	    this.username = username;
//	}
	
	public String getPassword() {
	    return password;
	}
	public void setPassword(String password) {
	    this.password = password;
	}
	
	public String getPasswordConfirmation() {
	    return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
	    this.passwordConfirmation = passwordConfirmation;
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
	
	public List<Role> getRoles() {
	    return roles;
	}
	public void setRoles(List<Role> roles) {
	    this.roles = roles;
	}
	
}
