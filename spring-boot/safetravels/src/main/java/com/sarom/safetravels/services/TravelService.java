package com.sarom.safetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.sarom.safetravels.models.Travel;
import com.sarom.safetravels.repositories.TravelRepository;

@Service
public class TravelService {
	private final TravelRepository travelRepository;
	
	public TravelService(TravelRepository travelRepository) {
		this.travelRepository = travelRepository;
	}
	
	// FIND ALL
	public List<Travel> allTravels() {
		return travelRepository.findAll();
	}
	
	// FIND ONE
	public Travel findOne(Long id) {
		Optional<Travel> option = travelRepository.findById(id);
		if(option.isPresent()) {
			return option.get();
		} else {
			return null;
		}
	}
	
	// Create
	public Travel create(Travel newExpense) {
		return travelRepository.save(newExpense);
	}
	
	// UPDATE
		public Travel update(Travel updatedExpense) {
			return this.travelRepository.save(updatedExpense);
		}
	
	// Delete
	public void deleteById(Long id) {
		this.travelRepository.deleteById(id);
	}
	
}
