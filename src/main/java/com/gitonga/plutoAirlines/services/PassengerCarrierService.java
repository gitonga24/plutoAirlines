package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.PassengerCarrier;
import com.gitonga.plutoAirlines.repositories.PassengerCarrierRepository;




@Service
public class PassengerCarrierService {
	
	
	@Autowired
	private PassengerCarrierRepository passengerCarrierRepo;
	
	
	//save
	public void save (PassengerCarrier employee) {
		passengerCarrierRepo.save(employee);
	}
	
	public List<PassengerCarrier> findAll(){
		return passengerCarrierRepo.findAll();
	}
	
	
	public  Optional<PassengerCarrier> findById(int id) {
		return passengerCarrierRepo.findById(id);
	}

	
	
	public void delete (int id) {
		passengerCarrierRepo.deleteById(id);
	}
	
}
