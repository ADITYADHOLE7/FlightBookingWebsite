package com.aditya.spring;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

		@RestController
		@RequestMapping("")
		public class CountryController {
			
			@Autowired
			public CountryRepository countryRepository;
			@Autowired
			public FlightRepository2 flightRepository2;
			
			@RequestMapping("/country")
			public ModelAndView searchCity()
			{
				ModelAndView m=new ModelAndView("country");
				Country u=new Country();
				m.addObject(u);
				return m;
			}
			
			
			@RequestMapping("/first")
			public ModelAndView flightDetails(@ModelAttribute("Country") Country country)
			{
				ModelAndView m=new ModelAndView("first");
				List<Flight> details=flightRepository2.flight_details(country.getCountryid(),country.getArrivalcity(),country.getDeparturecity());
				m.addObject("Flight",details);
				return m;
			}

		}

