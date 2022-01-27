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
public class DataController {
  @Autowired
	private DataService dataService;
  
  @GetMapping("/data") 
  
  public ModelAndView data() {
  	ModelAndView mav2 = new ModelAndView("data");
      mav2.addObject("user2", new Data());
      return mav2;
  }
  @PostMapping("/data")
  public String data(@ModelAttribute("user2") Data user2 ) {
  	
  	Data oauthUser=dataService.data(user2.getFlightname(),user2.getPrice());	    	
  	System.out.print(oauthUser);
  	if(Objects.nonNull(oauthUser)) 
  	{		  
  		return "redirect:/data"; 		
} else {
  		return "redirect:/flight";   		}
}
	@RequestMapping(value = {"/logi"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    	
	  
        return "redirect:/data";
    }

  }
   

