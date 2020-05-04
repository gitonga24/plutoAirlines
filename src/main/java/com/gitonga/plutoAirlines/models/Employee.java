package com.gitonga.plutoAirlines.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

	private Integer employeeClassificationid;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date hireDate;




	public Date getHireDate() {
		return hireDate;
	}



	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}



	@Override
	public String toString() {
		return "Employee [employeeClassification=" +  ", employeeClassificationid="
				+  ", hireDate=" + hireDate + "]";
	}
	
	
	

}
