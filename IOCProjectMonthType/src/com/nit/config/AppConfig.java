package com.nit.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
	
	@Bean(name="ldt")
	public LocalDateTime localLDT() {
			System.out.println("Local Date Time method called in configuration and returned current details");
		
		return LocalDateTime.now();
	}

}
