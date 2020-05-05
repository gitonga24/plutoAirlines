package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Country;
import com.gitonga.plutoAirlines.models.DestinationCity;
import com.gitonga.plutoAirlines.repositories.DestinationCityRepository;

@Service
public class DestinationCityService {
	
	@Autowired
	private DestinationCityRepository destinationCityRepo;
	
	//
	public void save(DestinationCity state) {
		destinationCityRepo.save(state);
	}
	
	
	public List <DestinationCity> findAll() {
		return destinationCityRepo.findAll();
	}

	
	public Optional<DestinationCity> findById(int id) {
		return destinationCityRepo.findById(id);
	}

	
	public void delete (Integer id) {
		destinationCityRepo.deleteById(id);
	}
	
}
