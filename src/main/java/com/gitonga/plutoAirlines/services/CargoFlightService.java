package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.CargoFlight;
import com.gitonga.plutoAirlines.repositories.CargoFlightRepository;

@Service
public class CargoFlightService {
	
@Autowired private CargoFlightRepository cargoFlightRepo;
	
	
	//
	public void save(CargoFlight commercialFlight) {
		cargoFlightRepo.save(commercialFlight);
	}
	
	
	public List<CargoFlight> getCargoFlights() {
		return cargoFlightRepo.findAll();
	}
	
	
	public List <CargoFlight> findAll() {
		return cargoFlightRepo.findAll();
	}

	
	public Optional<CargoFlight> findById(int id) {
		return cargoFlightRepo.findById(id);
	}

	
	public void delete (Integer id) {
		cargoFlightRepo.deleteById(id);
	}
	
	
	

}
