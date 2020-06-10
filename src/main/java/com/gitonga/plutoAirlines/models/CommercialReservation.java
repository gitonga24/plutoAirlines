package com.gitonga.plutoAirlines.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CommercialReservation extends Reservation {
	
	private Integer checkedBags;

	
	

	public Integer getCheckedBags() {
		return checkedBags;
	}

	public void setCheckedBags(Integer checkedBags) {
		this.checkedBags = checkedBags;
	}

	
	@ManyToOne
	@JoinColumn(name="passengerid", insertable=false, updatable=false)
	private Passenger passenger;
	private Integer passengerid;
	

	@ManyToOne
	@JoinColumn(name="commercialFlightid", insertable=false, updatable=false)
	private CommercialFlight commercialFlight;
	private Integer commercialFlightid;
	
	

	public CommercialFlight getCommercialFlight() {
		return commercialFlight;
	}

	public void setCommercialFlight(CommercialFlight commercialFlight) {
		this.commercialFlight = commercialFlight;
	}

	public Integer getCommercialFlightid() {
		return commercialFlightid;
	}

	public void setCommercialFlightid(Integer commercialFlightid) {
		this.commercialFlightid = commercialFlightid;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Integer getPassengerid() {
		return passengerid;
	}

	public void setPassengerid(Integer passengerid) {
		this.passengerid = passengerid;
	}
	


	@Override
	public String toString() {
		return "CommercialReservationService [checkedBags=" + checkedBags + "]";
	}
	
	
	
	
	

}
