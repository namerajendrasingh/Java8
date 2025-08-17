package com.raj.streams;

/**
 * @author Raj Singh
 * 4. Streams API
 * Need:
     Processing collections in Java pre-8 required manual iteration and boilerplate code. 
     The Stream API allows functional-style, declarative operations (filter, map, reduce) on collections, 
     often with parallelization, leading to more efficient data processing.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
		List<Integer> filterdList = arr.stream().filter(e->(e<4)).collect(Collectors.toList());
		for (Integer integer : filterdList) {
			System.out.println(integer);
		}
	}

}
