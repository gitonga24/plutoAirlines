package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gitonga.plutoAirlines.models.Country;
import com.gitonga.plutoAirlines.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepo;
	
	public List<Country> findAll(){
		return countryRepo.findAll();
	}
	
		//Save new country
		public void save(Country country) {
			countryRepo.save(country);
		}
		
		//get by id
		public Optional<Country> findById(int id) {
			return countryRepo.findById(id);
		}

		public void delete(Integer id) {
			 countryRepo.deleteById(id);
		}
		

}
