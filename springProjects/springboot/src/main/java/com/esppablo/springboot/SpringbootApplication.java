package com.esppablo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	// When a user visits the root route, have a nice message appear for the client.
    @RequestMapping("/")
    
    public String hello() { 
            return "Hello client! How are you doing?";
    }
    
	// When a user visits the '/random' route, have a nice message about Spring Boot appear for the client.
    @RequestMapping("/random")
    
    public String springBoot() { 
            return "Spring Boot is great! So easy to just respond with strings";
    }
    
      
    
}
