package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	/*@Bean("api1")
			@Primary
			public RestClient restClient() {
					return RestClient.builder()
													.baseUrl(env1.getProperty("students"))
													.build();
						}
			
			@Bean("api2")
			public RestClient restClient1() {
				return RestClient.builder()
												.baseUrl("http://localhost:8090")
												.build();
				
			}*/

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestt1Application.class, args);

	}

}
