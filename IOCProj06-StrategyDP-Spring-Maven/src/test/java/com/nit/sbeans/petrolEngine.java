package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public final class petrolEngine implements IEngine{
	public petrolEngine() {
		System.out.println("petrolEngine()- zero param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("petrolEngine.Engine Started");
		
		
	}

	@Override
	public void stopEngine() {
		System.out.println("petrolEngine.Engine Stopped");
		
	}

}
