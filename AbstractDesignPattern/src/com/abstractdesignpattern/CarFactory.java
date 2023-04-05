package com.abstractdesignpattern;

public abstract class CarFactory {

	public abstract String getEngine();
	public abstract String getBonnet();
	
	public String toString()
	{
		return "Engine=" +this.getEngine()+ " " +"Bonnet=" +this.getBonnet();
		
	}
	
}
