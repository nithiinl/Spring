package com.nit.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("month")
public class ShowMonth {
	
	@Autowired
	private LocalDateTime dateTime; 
	
	public ShowMonth(){
		System.out.println("GetSeason() Default constructor called!!!");
		
	}
	
	public String  getSeason() {
		int month=dateTime.getMonthValue();
		System.out.println(month);
		System.out.println("---------------->>>>>> SEASON FINDER <<<<<<<---------------");
		
		if(month>=2 && month<=3)
			return "Spring Season (Vasant)";
		else if(month>=3 && month<=5)
			return "Summer Season (Grishma)";
		else if(month>=6 && month<=9)
			return "Monsoon Season (Varsha)";
		else if(month>=10 && month<=11)
			return "Autumn Season (Sharad)";
		else if(month>=12 && month<=1)
			return "Pre-Winter Season (Hemant)";
		else if(month>=1 && month<=2)
			return "Winter Season (Shishir)";
		
		return "Invalid Season";
		
		
		
	}

}
