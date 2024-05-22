package com.nit.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
	
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		System.out.println("Date Time Configuration - Dependant Class");
		return LocalDateTime.now();
	}
	
	public AppConfig() {
		System.out.println("AppConfig: 0 param constructo");
	}

}
