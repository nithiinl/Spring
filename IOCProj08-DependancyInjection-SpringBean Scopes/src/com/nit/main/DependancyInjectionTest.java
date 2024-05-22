package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class DependancyInjectionTest {

	public static void main(String[] args) {
		// create IOC container  having @configuration class
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);  //.class is not an class file it is an java.lang.Class it comtains meta data abt class
		//get spring beans class object refrence
		
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		String resultMsg=generator.showWishMessage("Nithin");
		System.out.println(resultMsg);
		
		ctx.close();
	}
	

}
