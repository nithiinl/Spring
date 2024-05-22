package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependancyInjectionApplication {
	
	public BootProj01DependancyInjectionApplication() {
		System.out.println("BootProj01DependancyInjectionApplication() - 0 Param constructor");
	}
	
	@Bean(name = "ld")
	public LocalDate createLd() {
		System.out.println("createLd()");
		return LocalDate.now();
	}

	public static void main(String[] args) {
		System.out.println("----------main() method Start-----------");
		
		//get the IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj01DependancyInjectionApplication.class, args);
		
		//get target spring bean class
		SeasonFinder finder = ctx.getBean("sf", SeasonFinder.class);
		String msg= finder.findSeason();
		System.out.println("Output: "+msg);
		((ConfigurableApplicationContext) ctx).close();
		
		System.out.println("----------main() method Start-----------");
	}

}
