package com.nit.client;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		 Car car=CarFactory.getInstance("luxury");
		 car.start();
		 car.drive();
		 car.park();
		 System.out.println("-----------------------------------------");
		 Car car1=CarFactory.getInstance("standard");
		 car1.start();
		 car1.drive();
		 car1.park();
		 
		 Car car2=CarFactory.getInstance("sports");
		 car2.start();
		 car2.drive();
		 car2.park();

	}

}
