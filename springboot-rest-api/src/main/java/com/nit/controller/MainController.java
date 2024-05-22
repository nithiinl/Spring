package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping(path = "/home")
	public String home() {
		System.out.println("This is home page");
		return "index1";
	}
	
	@GetMapping("/home")
	public String home1() {
		System.out.println("This is second page");
		return "ind123";
	}
	
	/*@RequestMapping(value="/index.jsp")
	public String Nav() {
		System.out.println("This is nithin");
		return "Hello";
	}*/

}
