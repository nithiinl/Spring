package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.ShowMonth;

public class DependacyInjection {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ShowMonth month=ctx.getBean("month", ShowMonth.class);
		
		System.out.println(month.getSeason());
		ctx.close();

	}

}
