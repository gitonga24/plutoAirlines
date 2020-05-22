package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Country;
import com.gitonga.plutoAirlines.models.OperationsCity;
import com.gitonga.plutoAirlines.repositories.OperationsCityRepository;

@Service
public class OperationsCityService {
	
	@Autowired
	private OperationsCityRepository operationsCityRepo;
	
	//
	public void save(OperationsCity state) {
		operationsCityRepo.save(state);
	}
	
	
	public List <OperationsCity> findAll() {
		return operationsCityRepo.findAll();
	}

	
	public Optional<OperationsCity> findById(int id) {
		return operationsCityRepo.findById(id);
	}

	
	public void delete (Integer id) {
		operationsCityRepo.deleteById(id);
	}
	
}
