package com.nit.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngine")
//@Lazy(true)
public final class electricalEngine implements IEngine {
	public electricalEngine() {
		System.out.println("ElectricEngine()- zero param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine.Engine Started");

	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine.Engine Stopped");

	}

}
