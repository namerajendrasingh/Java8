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

public class StreamAPITest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream()
		     .filter(name -> name.startsWith("A"))
		     .forEach(System.out::println);
	}

}
