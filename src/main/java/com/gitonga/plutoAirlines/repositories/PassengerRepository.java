package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitonga.plutoAirlines.models.Passenger;



public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
