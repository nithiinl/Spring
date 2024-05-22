package com.nit.comps;

public class SportsCar implements Car {
	public SportsCar() {
		System.out.println("SportsCar( Zero param constructor)");
	}

	public  void drive() {
		System.out.println("SportsCar.drive()--> Driving Ferrari");
		

	}

	public void start() {
		System.out.println("SportsCar.start() ---> ferrari started");
		
		

	}

	public void park() {
		System.out.println("SportsCar.park()--> Ferrari stopped and parked");
		

	}

}
