package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ecommerce")
public class ECommercePortal {
	
	
	@Autowired
	private IPayment payment;
	
	public String shopping(String  items[], Double[] doubles) {
		
		double billAmt=0.0;
		for(double price: doubles) {
			billAmt=billAmt+price;
		}
		String txmsg= payment.doPayment(new Random().nextInt(100000), billAmt);
		
		if(txmsg!=null) {
			return Arrays.toString(items)+"having prices: "+Arrays.toString(doubles)+"are purchased having bill Amount"+billAmt;
		}
		return Arrays.toString(items)+"having prices: "+Arrays.toString(doubles)+"are purchased having bill Amount"+billAmt;
	
		
	}
	
	
	

}
