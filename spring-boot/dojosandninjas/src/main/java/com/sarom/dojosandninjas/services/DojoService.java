package com.sarom.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarom.dojosandninjas.models.Dojo;
import com.sarom.dojosandninjas.repositories.DojoRepo;

@Service
public class DojoService {
	
// PLATFORM WAY OF DOING IT
//	private final DojoRepo dojoRepo;
//	
//	public DojoService(DojoRepo dojoRepo) {
//		this.dojoRepo = dojoRepo;
//	}
	
// EASY WAY AROUND DEPENDENCY INJECTION
	@Autowired
		private DojoRepo dojoRepo;
	
	
// CREATE
	public Dojo create(Dojo newDojo) {
		return dojoRepo.save(newDojo);
	}
	
// FIND ALL
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}

// FIND ONE
	public Dojo findDojo(Long id) {
		Optional<Dojo> option = dojoRepo.findById(id);
		if(option.isPresent()) {
			return option.get();
		} else {
			return null;
		}
	}
}
