package com.decorator;

public class MainDecorator {

	public static void main(String[] args) {
		
		 //Shape circle=new Circle();
		 Shape circle1= new RedShapeDecorator(new Circle());
		 Shape rectangle =new Rectangle();
		 rectangle=new RedShapeDecorator(rectangle);
		 circle1.draw();
		 rectangle.draw();
	}
}
