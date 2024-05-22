package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.PayrollOperationsController;
import com.nit.model.Employee;

@SpringBootApplication
public class SpringBootOracleDb11Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootOracleDb11Application.class, args);
		PayrollOperationsController controller =ctx.getBean("payRoll", PayrollOperationsController.class);
		
		try {
			List<Employee> list=controller.showEmpByDesg("CLERT", "MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal problem try again");
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
