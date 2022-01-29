package com.aditya.spring;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int flight_no;
	@Column
	private String flight_name;
	@Column
	private String start_time;
	@Column
	private String end_time;
	@Column
	private int total_seats;
	@Column
	private int countryid;
	
	
	public Flight() {
	}
	
	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	public int getCountryid() {
		return countryid;
	}

	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}

	public Flight(int flight_no, String flight_name, String start_time, String end_time, int total_seats, int countryid) {
		this.flight_no = flight_no;
		this.flight_name = flight_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.total_seats = total_seats;
		this.countryid = countryid;
	}
	@Override
	public String toString()
	{
		return "Flight [flight_no=" + flight_no + ", flight_name=" + flight_name + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", total_seats=" + total_seats + ",countryid=" + countryid + "]";
	}

}
	


