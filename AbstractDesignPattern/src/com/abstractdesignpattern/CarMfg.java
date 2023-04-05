package com.abstractdesignpattern;

public class CarMfg {

	public static void main(String[] args) {
		CarFactory car1=Car.getCar(new Car1Factory("engine1", "bonnet1"));
		CarFactory car2=Car.getCar(new Car2Factory("engine2","bonnet2"));
		System.out.println("For Car1"+" "+car1);
		System.out.println("For Car2"+" "+car2);
	}
}
