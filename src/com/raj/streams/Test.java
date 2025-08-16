package com.raj.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
		List<Integer> filterdList = arr.stream().filter(e->(e<4)).collect(Collectors.toList());
		for (Integer integer : filterdList) {
			System.out.println(integer);
		}
	}

}
