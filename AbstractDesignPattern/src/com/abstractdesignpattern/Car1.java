package com.abstractdesignpattern;

public class Car1 extends CarFactory {

	private String engine;
	private String bonnet;
	
	public Car1(String engine, String bonnet) {
		super();
		this.engine = engine;
		this.bonnet = bonnet;
	}

	public String getEngine() {
		return this.engine;
	}
	public String getBonnet() {
		return this.bonnet;
	}
}
