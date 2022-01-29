package com.aditya.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface FlightRepository2 extends JpaRepository<Flight,Integer>
{
 @Query(value="select * from country join flight on country.countryid=flight.countryid where country.countryid=? and country.arrivalcity=? and country.departurecity=?",nativeQuery=true)
	public List<Flight> flight_details(int id,String arrivalcity,String departurecity);

}
 
