package com.gitonga.plutoAirlines.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
public class Passenger extends Person{
	
	private Integer rewardPoints;

	
 
	//many to many with Reservation
//	@ManyToOne  
//	@JoinColumn(name="commercialReservationid", insertable=false, updatable=false)
//	private CommercialReservation commercialReservation;
//	private Integer commercialReservationid;

	//OneToMany - Reservation. 
	

	@OneToMany(mappedBy="passenger")
	private List<CommercialReservation> commercialReservations;
	
	

	public Integer getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public String toString() {
		return "Passenger [rewardPoints=" + rewardPoints + "]";
	} 
	

}
