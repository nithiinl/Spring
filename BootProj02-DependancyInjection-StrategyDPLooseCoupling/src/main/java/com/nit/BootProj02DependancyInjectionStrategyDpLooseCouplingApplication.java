package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.ECommercePortal;

@SpringBootApplication
public class BootProj02DependancyInjectionStrategyDpLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02DependancyInjectionStrategyDpLooseCouplingApplication.class, args);
		ECommercePortal portal=ctx.getBean("ecommerce",ECommercePortal.class);
		
		
		/*try {
			String resultMsg=portal.shopping(new String[] {"dhotis","panchas","pants"},new double[] {1000.0,2000.0,3000.0}));
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(resultMgs);
			
		}*/
		
	}

}
