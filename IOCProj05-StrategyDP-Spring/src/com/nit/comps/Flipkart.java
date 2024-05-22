package com.nit.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fkpt")
public final class Flipkart {
	//HAS-A property
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()-zero param constructor");
	}

	@Autowired
	@Qualifier("dhl")//qualifier is taken final among all
	private ICourier courier;
	
	//setter method for setter injection
	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	public String shopping(String []items,double []prices) {
		System.out.println("Flipkart.shopping()");
		double billAmt=0.0;
		for(double p:prices) {
			billAmt=billAmt+p;
		}
		//generaate random number for orderid
		int oid=new Random().nextInt(10000);
		//use the courier
		String courierMsg=courier.deliver(oid);
		
		//generate for shopping and delivery;
		String resultMsg=Arrays.toString(items)+" are purchased having prices"+Arrays.toString(prices)+" with bill amount"+billAmt+"---->"+courierMsg;
		return resultMsg;
	}
	
}
