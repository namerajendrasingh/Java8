package com.raj.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaWithMultipleParameters {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (K,V)-> K+V;
		System.out.println(binaryOperator.apply(8, 9));
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		Integer total = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(total);	
		list.stream().forEach(e->
		                      {System.out.println(e.sum(0, e));		                
		                      });
	}

}
