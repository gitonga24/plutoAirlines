package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.CargoCarrier;
import com.gitonga.plutoAirlines.repositories.CargoCarrierRepository;


@Service
public class CargoCarrierService {
	
	
	@Autowired
	private CargoCarrierRepository cargoCarrierRepo;
	
	
	//save
	public void save (CargoCarrier cargoCarrier) {
		cargoCarrierRepo.save(cargoCarrier);
	}
	
	public List<CargoCarrier> findAll(){
		return cargoCarrierRepo.findAll();
	}
	
	
	public  Optional<CargoCarrier> findById(int id) {
		return cargoCarrierRepo.findById(id);
	}

	
	
	public void delete (int id) {
		cargoCarrierRepo.deleteById(id);
	}
	
}
