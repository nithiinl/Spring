package com.nit.factory;

import com.nit.comps.BlueDart;
import com.nit.comps.DTDC;
import com.nit.comps.Flipkart;
import com.nit.comps.ICourier;

public class FlipkartFactory {
	//static factory method having factory pattern logic
	public final  static Flipkart getInstance(String courierType) {
		ICourier courier=null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier=new DTDC();
		}
		else if(courierType.equalsIgnoreCase("bluedart")) {
			courier=new BlueDart();
		}
		else {
			throw new IllegalArgumentException("Invalid courier type");
		}
		
		//create target class object
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}

}
