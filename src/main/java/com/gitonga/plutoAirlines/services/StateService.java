package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Country;
import com.gitonga.plutoAirlines.models.State;
import com.gitonga.plutoAirlines.repositories.CountryRepository;
import com.gitonga.plutoAirlines.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired private StateRepository stateRepo;
	
	
	//
	public void save(State state) {
		stateRepo.save(state);
	}
	
	
	public List<State> getStates() {
		return stateRepo.findAll();
	}
	
	
	public List <State> findAll() {
		return stateRepo.findAll();
	}

	
	public Optional<State> findById(int id) {
		return stateRepo.findById(id);
	}

	
	public void delete (Integer id) {
		stateRepo.deleteById(id);
	}
	
}
