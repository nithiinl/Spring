package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApiTestt1Application {

	/*@Autowired
	private Environment env1;
	
	String url=env1.getProperty("students");
	
	public RestClient getClient() {
		switch(url) {
		case "students":
			return  RestClient.builder()
					.baseUrl(url)
					.build();
		
		case "courses":
			return RestClient.builder()
					.baseUrl(env1.getProperty("courses"))
					.build();
		
	}
		return null;
	
	}*/

	//@Bean

	/*public RestClient restClient() {
					return RestClient.builder()
													.baseUrl("http://localhost:8080")
													.build();
						}*/
	
	/*
		public RestClient.Builder restClient1() {
			return RestClient.builder();
		}*/
	/*	
		@Bean("api2")
		public RestClient restClient1() {
			return RestClient.builder()
											.baseUrl("http://localhost:8090")
											.build();
			
		}*/
	
							
							@Bean
							public RestTemplate restTemplate() {
								return new RestTemplate();
							}

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestt1Application.class, args);

	}

}
