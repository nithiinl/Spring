package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	       //field Injection
	private LocalDateTime dateTime; //it is an property
	private Date date;
	
	
	
	@Autowired //setter injection2
	public void setDate(Date date) {
		System.out.println("Setter injection2");
		this.date = date;
	}


	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0 Param constructor");
	}
	
	
	@Autowired //setter injection1
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("Setter injection using setter and getter methods");
		this.dateTime = dateTime;
	}

	//Business Method
	public String showWishMessage(String user) {
		System.out.println("Current date= "+dateTime+" "+date);
		
		//Get current hour of the day
		int hour=dateTime.getHour();  //24-hour format
		
		int day=date.getDay();
		DayOfWeek days=dateTime.getDayOfWeek();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("----------WEEKEND OR NOT----------");
		
		if(day<=4) {
			System.out.println("It is "+days+ " Goto Ofice!!!>>>>>>>>>>> Happy work<<<<<<<<<<<");
		}
		else {
			System.out.println(">>>>>>>>Happy Weekend!!<<<<<<<<");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("----------WISHMESSAGE----------");
	
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
