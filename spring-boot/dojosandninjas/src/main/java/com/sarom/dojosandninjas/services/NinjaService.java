package com.sarom.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarom.dojosandninjas.models.Dojo;
import com.sarom.dojosandninjas.models.Ninja;
import com.sarom.dojosandninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo ninjaRepo;

	// CREATE
	public Ninja create(Ninja newNinja) {
		return ninjaRepo.save(newNinja);
	}

	// FIND ALL
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}

	// FIND ONE
	public Ninja findNinjaWithDojos(Long id) {
		Optional<Ninja> option = ninjaRepo.findById(id);
		if (option.isPresent()) {
			return option.get();
		} else {
			return null;
		}
	}
}
