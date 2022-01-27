package com.aditya.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
	public class FlightService {	
			
			@Autowired
			private FlightRepository flightRepository;
			
		  
		  public Login login(String username, String password) {
			  Login user = flightRepository.findByUsernameAndPassword(username,password);
		  	return user;
		  }


			  
					

		}

	


