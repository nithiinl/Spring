package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public final class dieselEngine implements IEngine {
	public dieselEngine() {
		System.out.println("dieselEngine()- zero param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("dieselEngine.Engine Started");

	}

	@Override
	public void stopEngine() {
		System.out.println("dieselEngine.Engine Stopped");

	}

}
