package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Passenger;
import com.gitonga.plutoAirlines.repositories.PassengerRepository;

@Service
public class PassengerService {

	
	@Autowired
	private PassengerRepository passengerRepo;
	
	
	//save
	public void save (Passenger passenger) {
		passengerRepo.save(passenger);
	}
	
	public List<Passenger> findAll(){
		return passengerRepo.findAll();
	}
	
	
	public  Optional<Passenger> findById(int id) {
		return passengerRepo.findById(id);
	}

	
	
	public void delete (int id) {
		passengerRepo.deleteById(id);
	}
}
