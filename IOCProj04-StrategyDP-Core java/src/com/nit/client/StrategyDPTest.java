package com.nit.client;

import com.nit.comps.Flipkart;
import com.nit.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		//use factory
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		
		//invoke the business method
		String resultMsg=fpkt.shopping(new String[] {"sweets","shirts","dhotis"}, new double[] {1000.0,2000.0,3000.0});
	System.out.println(resultMsg);
	}

}
