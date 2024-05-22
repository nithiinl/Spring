package com.nit.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
//@Primary //makes the bean primary,removes ambuguity
public final class BlueDart implements ICourier {
	
	public BlueDart() {
		System.out.println("BlueDart() - Zero param constructor");
		
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid +" order id is ready to deliver using BlueDart courier service";
	}

}
