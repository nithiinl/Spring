package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Vehicle;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle1=ctx.getBean("vehicle", Vehicle.class);
		vehicle1.journey("hyd","guntur");
		
	}
	
	

}
