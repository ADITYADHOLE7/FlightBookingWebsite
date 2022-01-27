package com.aditya.spring;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FlightController2 {

	@Autowired
	private FlightService2 flightService2;
	
	 @GetMapping("/flight")    
	    public ModelAndView flight() {
	    	ModelAndView mav1 = new ModelAndView("flight");
	        mav1.addObject("user1", new Flight());
	        return mav1;
	    }
	  @PostMapping("/flight")
	    public String flight(@ModelAttribute("user1") Flight user1 ) {
	    	
	    	Flight oauthUser=flightService2.flight(user1.getArrivalcity(),user1.getDeparturecity());	    	
	    	System.out.print(oauthUser);
	    	if(Objects.nonNull(oauthUser)) 
	    	{		  
	    		return "redirect:/data"; 		
  	} else {
	    		return "redirect:/data";   		}
	  }
	  @RequestMapping(value = {"/log"}, method = RequestMethod.POST)
	    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
	    {
	    	
		  
	        return "redirect:/flight";
	    }
	
	  }
    

	    

