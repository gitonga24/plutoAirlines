package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitonga.plutoAirlines.models.CommercialFlight;
import com.gitonga.plutoAirlines.models.Flight;



public interface CommercialFlightRepository extends JpaRepository <CommercialFlight, Integer> {

}
