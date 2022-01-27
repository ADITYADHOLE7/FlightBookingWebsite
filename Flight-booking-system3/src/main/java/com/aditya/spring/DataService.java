package com.aditya.spring;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	@Autowired
	private DataRepository dataRepository;
	
	  public Data data(String flightname, String price) {
		  Data user2 = dataRepository.findByFlightnameAndPrice(flightname,price);
	  	return user2;
	  }

}
