package com.abstractdesignpattern;
public class Car1Factory implements CarAbstractFactory{

	private String engine;
	private String bonnet;
	
	public Car1Factory(String engine, String bonnet) {
		super();
		this.engine = engine;
		this.bonnet = bonnet;
	}
	@Override
	public CarFactory createCar() {
		return new Car1(engine,bonnet);
	}

}
