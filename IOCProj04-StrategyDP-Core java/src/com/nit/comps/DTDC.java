package com.nit.comps;

public class DTDC implements ICourier {
	public DTDC() {
		System.out.println("DTDC()-zero param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		// TODO Auto-generated method stub
		return oid +" order id is ready to deliver using DTDC courier service";
	}

}
