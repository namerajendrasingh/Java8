package com.raj.deloitee;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//second largest second smallest
		Integer[] nums = {1,7,18,25,77,300,101};
		List<Integer> list = Arrays.asList(nums);
		Integer secondSmallest = list.stream().sorted().skip(1).findFirst().get();
		System.out.println("Second Smallest : "+ secondSmallest);
		
		Integer secondLargest = list.stream().sorted((o1, o2) -> o2-o1 ).skip(1).findFirst().get();
		System.out.println("Second Largest : "+ secondLargest);
        
	}

}
