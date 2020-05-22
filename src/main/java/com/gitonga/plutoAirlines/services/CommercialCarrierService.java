package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.CommercialCarrier;
import com.gitonga.plutoAirlines.repositories.CommercialCarrierRepository;




@Service
public class CommercialCarrierService {
	
	
	@Autowired
	private CommercialCarrierRepository commercialCarrierRepo;
	
	
	//save
	public void save (CommercialCarrier passenger) {
		commercialCarrierRepo.save(passenger);
	}
	
	public List<CommercialCarrier> findAll(){
		return commercialCarrierRepo.findAll();
	}
	
	
	public  Optional<CommercialCarrier> findById(int id) {
		return commercialCarrierRepo.findById(id);
	}

	
	
	public void delete (int id) {
		commercialCarrierRepo.deleteById(id);
	}
	
}
