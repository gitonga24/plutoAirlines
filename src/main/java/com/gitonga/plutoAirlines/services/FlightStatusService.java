package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.FlightStatus;
import com.gitonga.plutoAirlines.repositories.FlightStatusRepository;

@Service
public class FlightStatusService {

@Autowired private FlightStatusRepository flightStatusRepo;
	
	
	//
	public void save(FlightStatus flightStatus) {
		flightStatusRepo.save(flightStatus);
	}
	
	
	public List<FlightStatus> getFlightStatuss() {
		return flightStatusRepo.findAll();
	}
	
	
	public List <FlightStatus> findAll() {
		return flightStatusRepo.findAll();
	}

	
	public Optional<FlightStatus> findById(int id) {
		return flightStatusRepo.findById(id);
	}

	
	public void delete (Integer id) {
		flightStatusRepo.deleteById(id);
	}
	
	
}
