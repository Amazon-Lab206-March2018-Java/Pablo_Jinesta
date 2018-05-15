package com.esppablo.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esppablo.dojoninjas.models.Dojo;
import com.esppablo.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	// return all Dojos
	public List<Dojo> allDojos(){
		return (List<Dojo>) dojoRepository.findAll();
	}
	
	// add new Dojo
	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	// return Dojo
	public Dojo findDojo(Long id) {
		return dojoRepository.findById(id).get();
	}
}
