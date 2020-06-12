package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Pilot;
import com.gitonga.plutoAirlines.repositories.PilotRepository;

@Service
public class PilotService {
	
	
	@Autowired
	private PilotRepository pilotRepo;
	
	
	//save
	public void save (Pilot pilot) {
		pilotRepo.save(pilot);
	}
	
	public List<Pilot> findAll(){
		return pilotRepo.findAll();
	}
	
	
	public  Optional<Pilot> findById(int id) {
		return pilotRepo.findById(id);
	}

	
	
	public void delete (int id) {
		pilotRepo.deleteById(id);
	}

}
