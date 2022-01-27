package com.aditya.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
@Id	
@GeneratedValue(strategy= GenerationType.IDENTITY)


private Long id;
private String arrivalcity;
private String departurecity;



public Flight()
{	}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getArrivalcity() {
	return arrivalcity;
}



public void setArrivalcity(String arrivalcity) {
	this.arrivalcity = arrivalcity;
}



public String getDeparturecity() {
	return departurecity;
}



public void setDeparturecity(String departurecity) {
	this.departurecity = departurecity;
}



public Flight(Long id, String arrivalcity, String departurecity) {
	super();
	this.id = id;
	this.arrivalcity = arrivalcity;
	this.departurecity = departurecity;
}


}
