package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		Stream<Integer> str=Stream.of(1,2,3,4,5);
		str.forEach(a->System.out.print(a));
		System.out.println();
	
		Stream<Integer> str1=Stream.of(new Integer[] {1,2,3,4,5});
		str1.forEach(b->System.out.print(b));
		System.out.println();
		
		for(int i=01;i<=5;i++)
		{
			list.add(i);
		}
		Stream<Integer> str2=list.stream();
		str2.forEach(c->System.out.print(c));
	}
}
