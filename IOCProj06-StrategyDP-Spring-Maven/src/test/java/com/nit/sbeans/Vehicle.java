package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()- zero param constructor");
	}
	
	@Autowired
	@Qualifier("eEngine")
	private IEngine engg;

	
	//business Method
	
	public void journey(String startPlace, String endplace) {
		System.out.println("Vehicle.journey()");
		engg.startEngine();
		System.out.println("Journey started from: "+startPlace);
		System.out.println("Journey is going on........");
		engg.stopEngine();
		System.out.println("Journey ended at: "+endplace);
		
	}
}
