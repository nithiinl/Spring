package com.nit.factory;

import com.nit.comps.Car;
import com.nit.comps.LuxuryCar;
import com.nit.comps.SportsCar;
import com.nit.comps.StandardCar;

public class CarFactory {

		public static Car getInstance(String type) {
			Car car=null;
			if(type.equalsIgnoreCase("sports")) {
				car=new SportsCar();
			}
			else if(type.equalsIgnoreCase("standard")) {
				car=new StandardCar();
			}
			else if(type.equalsIgnoreCase("luxury")) {
				car=new LuxuryCar();
			}
			else {
				throw new IllegalArgumentException("Invalid Car Details");
			}
			return car;
					
		}
}
