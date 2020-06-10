package com.gitonga.plutoAirlines.models;

import java.util.List;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Reservation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	public Integer getId() {
		return id;
	}


	

	



	public void setId(Integer id) {
		this.id = id;
	}

	//many to one - (Passenger) Passenger can have many reservations. Reservation can only be associated with one passenger. 

	public void setPassengers(List<Passenger> passengers) {
		passengers = passengers;
	}



	@Override
	public String toString() {
		return "Reservation [id=" + id + "]";
	}
	
	
	
	
	

}
