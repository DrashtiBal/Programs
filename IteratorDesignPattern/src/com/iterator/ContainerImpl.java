package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class ContainerImpl implements Container {

	List  cartproducts;
	
	public ContainerImpl()
	{
		cartproducts=new ArrayList<Product>();
	}
	@Override
	public void addProducts(Product product) {
		cartproducts.add(product);
		
	}
	@Override
	public Iterator iterator() {
		
		return new IteratorImpl();
	}

	public class IteratorImpl implements Iterator{

		int currentposition=0;
		@Override
		public Product next() {
			
			return (Product) cartproducts.get(currentposition++);
		}

		@Override
		public boolean hasNext() {
			if(currentposition >= cartproducts.size()) {
				return false;
			}
			return true;
		}
		
	}
	
}
