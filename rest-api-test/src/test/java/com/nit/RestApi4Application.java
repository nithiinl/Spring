package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class RestApi4Application {
	
	@Autowired
	private Environment env;
	
	/*String url=env.getProperty("students");
	
	@Bean("api1")
	@Primary
	public RestClient getClient() {
		switch(url) {
		case "students":
			return  RestClient.builder()
					.baseUrl(env.getProperty("students"))
					.build();
		
		case "courses":
			return RestClient.builder()
					.baseUrl(env.getProperty("students"))
					.build();
		
	}
		return null;
	
	}*/
	
	
	@Bean("api1")
		@Primary
		public RestClient restClient() {
				return RestClient.builder()
												.baseUrl(env.getProperty("students"))
												.build();
					}
		
		@Bean("api2")
		public RestClient restClient1() {
			return RestClient.builder()
											.baseUrl("http://localhost:8090")
											.build();
			
		}

	public static void main(String[] args) {
		SpringApplication.run(RestApi4Application.class, args);
		
		
	}

}
