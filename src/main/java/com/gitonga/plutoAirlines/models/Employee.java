package com.gitonga.plutoAirlines.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Employee extends Person{
	
	

//	@ManyToOne
//	@JoinColumn(name="employeeClassificationid", insertable=false, updatable=false)
//	private EmployeeClassification employeeClassification;

	@ManyToOne
	@JoinColumn(name="countryid", insertable=false, updatable=false)
	private Country country;
	private Integer countryid;
	
	
	@ManyToOne
	@JoinColumn(name="stateid", insertable=false, updatable=false)
	private State state;
	public State getState() {
		return state;
	}


	


	public void setState(State state) {
		this.state = state;
	}



	public Integer getStateid() {
		return stateid;
	}



	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}



	private Integer stateid;
	
	
	private Integer employeeClassificationid;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date hireDate;




	public Country getCountry() {
		return country;
	}



	public void setCountry(Country country) {
		this.country = country;
	}



	public Integer getCountryid() {
		return countryid;
	}



	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}



	public Integer getEmployeeClassificationid() {
		return employeeClassificationid;
	}



	public void setEmployeeClassificationid(Integer employeeClassificationid) {
		this.employeeClassificationid = employeeClassificationid;
	}



	public Date getHireDate() {
		return hireDate;
	}



	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}



	@Override
	public String toString() {
		return "Employee [country=" + country + ", countryid=" + countryid + ", state=" + state + ", stateid=" + stateid
				+ ", employeeClassificationid=" + employeeClassificationid + ", hireDate=" + hireDate + "]";
	}
	
	
	

}
