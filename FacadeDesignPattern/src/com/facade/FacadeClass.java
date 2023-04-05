package com.facade;

public class FacadeClass {

	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	public FacadeClass() {
		circle=new Circle();
		rectangle=new Rectangle();
		triangle=new Triangle();
	}
	
	public void circle() {
		circle.draw();
	}
	public void rectangle() {
		rectangle.draw();
	}
	public void triangle() {
		triangle.draw();
	}
	
}
