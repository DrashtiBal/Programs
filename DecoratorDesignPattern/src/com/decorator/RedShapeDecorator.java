package com.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape)
	{
		super(shape);
	}
	
	public void draw()
	{
		shape.draw();
		setRedBorder(shape);
	}
	private void setRedBorder(Shape Shape)
	{
		System.out.println("Border color:Red");
	}
	
}
