package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	@Autowired
	private LocalDate date;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder - 0 Param constructor");
	}
	
	public String findSeason() {
		//get current month of year
		int month=date.getMonthValue();
		if(month>=3 && month<=6)
			return "Summer Season";
		else if(month>=7 && month<=10)
			return "Rainy  Season";
		else 
			return "Winter Season";
	}
	

}
