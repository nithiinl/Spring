package com.nit.comps;

public class StandardCar implements Car {
	
	public StandardCar() {
	System.out.println("Standard car zero param constructor");
	}

	public void drive() {
		// TODO Auto-generated method stub
	System.out.println("StandardCar.drive()-->Driving Maruthi ");

	}

	public  void start() {
	System.out.println("StandardCar.start()--> Maruthi Started");

	}

	public void  park() {
		System.out.println("StandardCar.park()--> Mauthi car stopped and parked");
	}

}
