package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/form")

public class productController {
	
	
	
	@GetMapping(value = {"/","/loadForm"})
	public String data() {
		return "index";
	}
	
	
	@PostMapping("/saveProduct")
	public String handleSubmitBtn(@RequestParam String pid, @RequestParam String pname, @RequestParam String pprice, Model model ) {
		System.out.println("Save Product() Method is triggered!!");
		
		model.addAttribute("id",pid);
		model.addAttribute("name",pname);
		model.addAttribute("price",pprice);
	//S	System.out.println(""+pid+""+pname+""+pprice);
		
		
		
		

		
		/*//logic to save form data
		String pid=req.getParameter("pid");
		String pname=req.getParameter("pname");
		String pprice=req.getParameter("pprice");
		
		System.out.println("Product ID:"+pid);
		System.out.println("Product Name:"+pname);
		System.out.println("Product Price:"+pprice);
		
		model.addAttribute("msg","Product saved to catalog successfuly.....!!");*/
		
		return "success";
	}
}
