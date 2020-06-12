package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.FlightAttendant;
import com.gitonga.plutoAirlines.repositories.FlightAttendantRepository;

@Service
public class FlightAttendantService {
	
	
	@Autowired
	private FlightAttendantRepository flightAttendantRepo;
	
	
	//save
	public void save (FlightAttendant flightAttendant) {
		flightAttendantRepo.save(flightAttendant);
	}
	
	public List<FlightAttendant> findAll(){
		return flightAttendantRepo.findAll();
	}
	
	
	public  Optional<FlightAttendant> findById(int id) {
		return flightAttendantRepo.findById(id);
	}

	
	
	public void delete (int id) {
		flightAttendantRepo.deleteById(id);
	}

}
