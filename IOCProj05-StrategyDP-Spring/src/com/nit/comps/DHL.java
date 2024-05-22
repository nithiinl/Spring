package com.nit.comps;

import org.springframework.stereotype.Component;

@Component("dhl")
//@Lazy(true)///removes eager instantiation

public class DHL implements ICourier {
	public DHL() {
		System.out.println("DHL()-zero param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		// TODO Auto-generated method stub
		return oid +" order id is ready to deliver using DHL courier service";
	}

}
