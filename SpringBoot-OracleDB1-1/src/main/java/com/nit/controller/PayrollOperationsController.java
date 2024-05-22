package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.IEmployeeMgmtService;

@Controller("payRoll")
public class PayrollOperationsController {
	
	@Autowired
	private  IEmployeeMgmtService empService;

	
	public List<Employee> showEmpByDesg(String desg1, String desg2, String desg3) throws Exception{
		List<Employee> list= empService.fetchEmployeeByDesgs(desg1, desg2, desg3);
		return list;
	}
}
