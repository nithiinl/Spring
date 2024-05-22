package com.nit.client;

import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nit.config.AppConfig;
import com.nit.sbeans.PersonDetails;

public class ValueAnnotationsTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		PersonDetails person=ctx.getBean("pDetails", PersonDetails.class);
		System.out.println(person);
		
		System.out.println("-------------------------------------");
		
		Properties props=System.getProperties();
		System.out.println("System Properties: "+props);
		
		System.out.println("-------------------------------------");
	Environment env=ctx.getEnvironment();
	System.out.println(env);
	System.out.println("OS name: "+env.getProperty("os.name")+"\n"+ "OS Version: "+env.getProperty("os.version"));
		ctx.close();
	}

}
