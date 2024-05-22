package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class RestApi4Application {
	
	
	
	@Bean("api1")
		@Primary
		public RestClient restClient() {
				return RestClient.builder()
												.baseUrl("http://localhost:8080")
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
