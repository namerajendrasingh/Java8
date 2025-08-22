package com.raj.streams;

import java.util.List;

public class PeekMethodUseCase {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		Integer sum = list.stream()
		    .peek(num-> System.out.print("Before Filtering"+num))
		    .filter(num-> num>5)
		    .peek(num-> System.out.println("After Filtering :"+num))
		    .mapToInt(Integer::intValue)
		    .sum();
		System.out.println("Sum :"+sum);
	}

}
