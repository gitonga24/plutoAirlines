package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gitonga.plutoAirlines.models.PassengerCarrier;



public interface PassengerCarrierRepository extends JpaRepository <PassengerCarrier, Integer> {

}