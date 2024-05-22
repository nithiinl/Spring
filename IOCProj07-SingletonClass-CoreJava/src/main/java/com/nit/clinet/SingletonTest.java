package com.nit.clinet;

import com.nit.ston.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		//get printer Instance
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		System.out.println("p1: "+p1.hashCode()+"-------------->p2: "+p2.hashCode());
		
		p1.printData("Hello");
		p2.printData("How are you");
		

	}

}
