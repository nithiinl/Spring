package com.nit.comps;

public class LuxuryCar implements Car {
	
	public LuxuryCar() {
	System.out.println("Luxury car zero param constructor");
	}

	public void drive() {
		
	System.out.println("LuxuryCar.drive()-->Driving Audi");

	}

	public  void start() {
	System.out.println("LuxuryCar.start()--> Audi Started");

	}

	public void  park() {
		System.out.println("LuxuryCar.park()--> Audi car stopped and parked");
	}

}
