package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IEmployeeDAO;
import com.nit.model.Employee;


@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> fetchEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list=empDAO.getEmpByDesgs(desg1, desg2, desg3);
		list.forEach(emp->{
			double grossSalary=emp.getSalary()+emp.getSalary()*0.4;
			double netSalary=grossSalary-(grossSalary*0.2);
			emp.setGrossSalary(grossSalary);
			emp.setNetSalary(netSalary);
			System.out.println(grossSalary);
			System.out.println(netSalary);
		});
	
		return list;
	}

}
