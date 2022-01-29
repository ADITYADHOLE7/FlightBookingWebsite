package com.aditya.spring;


	import javax.persistence.Column;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="country")
	public class Country {
	@Id	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int countryid;
	@Column
	private String arrivalcity;
	@Column
	private String departurecity;

	public Country()
	{	}

	public int getCountryid() {
		return countryid;
	}

	public void setCountryid(int countryid) {
		this.countryid = countryid;
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

	public Country(int countryid, String arrivalcity, String departurecity) {
		this.countryid = countryid;
		this.arrivalcity = arrivalcity;
		this.departurecity = departurecity;
	}

	@Override
	public String toString() {
		return "Country [countryid=" + countryid + ", arrivalcity=" + arrivalcity + ", departurecity=" + departurecity + "]";
	}

	

	}

