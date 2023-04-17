package com.iterator;

public class IteratorMain extends ContainerImpl {

	public static void main(String[] args) {
		Product p1=new Product("pen", 2);
		Product p2=new Product("book", 7);
		
		ContainerImpl c1=new ContainerImpl();
		c1.addProducts(p1);
		c1.addProducts(p2);
		
		System.out.println("Cart Products:");
		Iterator iterator = c1.iterator();
		
		while(iterator.hasNext())
		{
			Product product=iterator.next();
			System.out.println(product);
		}
	}
}
