package com.nit.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired         //field Injection
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0 Param constructor");
	}
	
	//Business Method
	public String showWishMessage(String user) {
		
		//Get current hour of the day
		
		int hour=dateTime.getHour();  //24-hour format
		if(hour<12) 
			return "Good Morning: " +user;
		else if(hour<16)
			return "Good Afternoon: " +user;
		else if(hour<20)
			return "Good Evening: " +user;
		else 
			return "Good Night: " +user;
		
	}

}
