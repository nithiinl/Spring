package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.comps.Flipkart;
import com.nit.config.AppConfig;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		//create IOC container
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	
	//get target spring bean class object
	Flipkart fpkt=ctx.getBean("fkpt",Flipkart.class);
	
	//invoke the business method
	try {
		String resultMsg=fpkt.shopping(new String[] {"kurta","paizama","shirt"}, new double[] {2000.0,1000.0,500.0});
		System.out.println(resultMsg);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	ctx.close();
	
	
	}

}
