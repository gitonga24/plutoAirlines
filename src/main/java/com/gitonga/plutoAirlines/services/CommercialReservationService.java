package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.CommercialReservation;
import com.gitonga.plutoAirlines.repositories.CommercialReservationRepository;

@Service
public class CommercialReservationService {
	
	@Autowired
	private CommercialReservationRepository commercialReservationRepo;
	
	
	//save
	public void save (CommercialReservation commercialReservation) {
		commercialReservationRepo.save(commercialReservation);
	}
	
	public List<CommercialReservation> findAll(){
		return commercialReservationRepo.findAll();
	}
	
	
	public  Optional<CommercialReservation> findById(int id) {
		return commercialReservationRepo.findById(id);
	}

	
	
	public void delete (int id) {
		commercialReservationRepo.deleteById(id);
	}
	

}
