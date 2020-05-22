package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gitonga.plutoAirlines.models.CommercialCarrier;



public interface CommercialCarrierRepository extends JpaRepository <CommercialCarrier, Integer> {

}