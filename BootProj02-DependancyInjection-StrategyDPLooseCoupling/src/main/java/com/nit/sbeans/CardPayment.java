package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("netBank")
public class CardPayment implements IPayment {
	public CardPayment() {
		System.out.println("CardPayment()- 0 param constructor");
	}

	@Override
	public String doPayment(int orderid, double amt) {
		System.out.println("CardPayment.doPayment()- method called");
		return "CardPayment is done(Card) for the order ID: "+orderid+" Having the bill amount: "+amt;
	}

}
