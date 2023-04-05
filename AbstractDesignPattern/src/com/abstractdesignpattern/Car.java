package com.abstractdesignpattern;

public class Car {

	public static CarFactory getCar(CarAbstractFactory factory)
	{
	return factory.createCar();
	}
}
