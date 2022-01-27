package com.aditya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FlightService2 {
	@Autowired
	private FlightRepository2 flightRepository2;
	
	  public Flight flight(String arrivalcity, String departurecity) {
		  Flight user1 = flightRepository2.findByArrivalcityAndDeparturecity(arrivalcity,departurecity);
	  	return user1;
	  }

}
