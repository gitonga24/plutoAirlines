package com.gitonga.plutoAirlines.models;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CargoFlight extends Flight {
	
	private Float maxWeight;
	private Float totalWeight;
	public Float getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(Float maxWeight) {
		this.maxWeight = maxWeight;
	}
	public Float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}
	@Override
	public String toString() {
		return "CargoFlightService [maxWeight=" + maxWeight + ", totalWeight=" + totalWeight + "]";
	}

	
	
	
}
