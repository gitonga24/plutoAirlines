package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.CommercialFlight;
import com.gitonga.plutoAirlines.repositories.CommercialFlightRepository;

@Service
public class CommercialFlightService {
	
@Autowired private CommercialFlightRepository commercialFlightRepo;
	
	
	//
	public void save(CommercialFlight commercialFlight) {
		commercialFlightRepo.save(commercialFlight);
	}
	
	
	public List<CommercialFlight> getCommercialFlights() {
		return commercialFlightRepo.findAll();
	}
	
	
	public List <CommercialFlight> findAll() {
		return commercialFlightRepo.findAll();
	}

	
	public Optional<CommercialFlight> findById(int id) {
		return commercialFlightRepo.findById(id);
	}

	
	public void delete (Integer id) {
		commercialFlightRepo.deleteById(id);
	}
	
	

}
