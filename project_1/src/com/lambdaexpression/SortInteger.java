package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortInteger {
	public static void main(String[] args) {
		
		 List<Integer> list1=Arrays.asList(1,10,5,5,2,2,0); 
		 Stream<Integer>stream=list1.stream().sorted(); 
		 stream.forEach(System.out::println);
		 List<String>list2=Arrays.asList("drashti","aisha","diya","abhi","akshay","drashti");
		 Stream<String>stream1=list2.stream().filter(s->s.startsWith("a"));
		 stream1.forEach(System.out::println);
		 
		 List<Integer> list3=Arrays.asList(10,20,30,5); 
		 Set<Integer> s1=new HashSet<>();
		 List<Integer>list4=(List<Integer>) list3.stream().filter(d->!s1.add(d)).collect(Collectors.toList());
		 System.out.println(list4);
		 
		 long list5=list3.stream().count();
		 System.out.println(list5);
		 
		 int sum=list3.stream().mapToInt(a->a).sum();
		 System.out.println("Avg="+sum/list3.stream().count());
		 
			Stream<Integer> s6=list3.stream().sorted(Collections.reverseOrder());
			s6.forEach(System.out::println);
		 
			List<Integer> list7=(List<Integer>) list3.stream().map(n1->n1*n1).filter(n2->n2>100).collect(Collectors.toList());
			System.out.println(list7);
			
			int list8=list7.stream().mapToInt(b->b.intValue()).sum();
			System.out.println("Avg="+list8/list3.stream().count());
		 
	}
}
