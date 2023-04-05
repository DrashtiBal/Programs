package com.abstractdesignpattern;

public class Car2Factory implements CarAbstractFactory {

	private String engine;
	private String bonnet;
	
	public Car2Factory(String engine, String bonnet) {
		super();
		this.engine = engine;
		this.bonnet = bonnet;
	}
	@Override
	public CarFactory createCar() {
		return new Car2(engine,bonnet);
	}

	
}
