package com.nit.ston;

public class Printer {
	//private static class refernce variable---(2)
	private static Printer instance; 
	
	//private constructor---(1)
	private Printer() {
		System.out.println("Printer.Printer()-0 param constructor");
		
	}
	//static factory having singleton class logic ----(3)
	public static  Printer getInstance() {
		//write singleton logic
		if(instance==null)
			instance=new Printer();
		return instance;
		
		
	}
	
	//Buisiness method
	public void printData(String msg) {
		//print the content
		System.out.println(msg);
	}

}
