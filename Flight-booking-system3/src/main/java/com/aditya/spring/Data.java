package com.aditya.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="data")
	
	public class Data{
	@Id	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long flightid;
	private String flightname;
	private String price;
	

	public Data()
	{
		
	}

	public Data(Long flightid, String flightname, String price) {
		super();
		this.flightid = flightid;
		this.flightname = flightname;
		this.price = price;
	}

	public Long getFlightid() {
		return flightid;
	}


	public void setFlightid(Long flightid) {
		this.flightid = flightid;
	}


	public String getFlightname() {
		return flightname;
	}


	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	

}
