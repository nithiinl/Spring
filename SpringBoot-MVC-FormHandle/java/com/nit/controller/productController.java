package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/form")
@ResponseBody
public class productController {

	@GetMapping(value = {"/","/loadform"})
	public String loadForm() {
		return "Success";
	}
	
}