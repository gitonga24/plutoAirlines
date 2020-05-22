package com.gitonga.plutoAirlines.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CargoCarrier extends Carrier {
	
	private Float maxWeight;
		public Float getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(Float maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public String toString() {
		return "CargoCarrier [maxWeight=" + maxWeight + "]";
	}
	
	
	
	
	
	


	
	

}
