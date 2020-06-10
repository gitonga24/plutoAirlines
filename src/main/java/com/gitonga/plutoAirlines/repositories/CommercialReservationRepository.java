package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitonga.plutoAirlines.models.CommercialReservation;

public interface CommercialReservationRepository extends JpaRepository <CommercialReservation, Integer> {

}
