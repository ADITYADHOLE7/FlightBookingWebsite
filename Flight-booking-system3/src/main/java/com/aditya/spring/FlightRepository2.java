package com.aditya.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FlightRepository2 extends JpaRepository<Flight,Long>
{
	Flight findByArrivalcityAndDeparturecity(String arrivalcity,String departurecity);

}
 
