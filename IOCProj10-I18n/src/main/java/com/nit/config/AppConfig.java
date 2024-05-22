package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean("messageSource")//It is fixed bean ID
	public ResourceBundleMessageSource createRBMS() { //It is fixed method name
		ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
		rbms.setBasename("com/nit/commons/App");
		return rbms;
	}
	

}
