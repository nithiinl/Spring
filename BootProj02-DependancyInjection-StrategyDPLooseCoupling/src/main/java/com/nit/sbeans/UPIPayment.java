package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements IPayment {
	public UPIPayment() {
		System.out.println("UPIPayment()- 0 param constructor");
	}

	@Override
	public String doPayment(int orderid, double amt) {
		System.out.println("UPIPayment.doPayment()- method called");
		return "UPI payment is done(Phonepay) for the order ID: "+orderid+" Having the bill amount: "+amt;
	}

}
