package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface FunctionalInterface1{
	public abstract int  calculate(int x);
}
public class Test {

	public static void main(String[] args) {
		FunctionalInterface1 f1=(x)->(2*x);
		System.out.println(f1.calculate(5));
		
		
		List<String> list=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		list.add("drashti");
		list.add("kiya");
		list.add("siya");
		list.add("diya");
		
	Stream<String> stream=list.stream().filter(s->s.endsWith("i"));
	stream.forEach(System.out::println);
	Stream<String> stream1 = list.stream().map(String::toUpperCase) .sorted() ;
	stream1.forEach(System.out::println);
	
	List<String> list3=list.stream().sorted().collect(Collectors.toList());
	System.out.println(list3);
	}
}
