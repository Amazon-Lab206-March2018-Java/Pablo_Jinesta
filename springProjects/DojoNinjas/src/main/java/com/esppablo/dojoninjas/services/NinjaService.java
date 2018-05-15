package com.esppablo.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esppablo.dojoninjas.models.Ninja;
import com.esppablo.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	// return all ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
	
	// add new Ninja
	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
}
