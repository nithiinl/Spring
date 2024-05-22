package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("card")
public class NetBankingPayment implements IPayment {
	public NetBankingPayment() {
		System.out.println("NetBankingPayment()- 0 param constructor");
	}

	@Override
	public String doPayment(int orderid, double amt) {
		System.out.println("NetBankingPayment.doPayment()- method called");
		return "NetBankingpayment is done(NetBanking) for the order ID: "+orderid+" Having the bill amount: "+amt;
	}

}
