package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class JspController {
	
	@RequestMapping("/home1")
	public String getJsp(Model model) {
		
		String myName="nithin";
		String name="nikhil";
		model.addAttribute("name", name);
		model.addAttribute("myValue",myName);
		return "hello_world";
	}
	
	@RequestMapping("/home")
	public String getJsp2() {
		return "final";
	}

}
