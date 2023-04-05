package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("drashtibalsara","sonali","diya","priya");
		Optional<String> result=list1.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
		System.out.println(result);
	}
}
