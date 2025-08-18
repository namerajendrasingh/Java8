package com.raj.streams;

import java.util.ArrayList;
/**
 * @author Raj Singh
 * 4. Streams API
 * Need:
     Processing collections in Java pre-8 required manual iteration and boilerplate code. 
     The Stream API allows functional-style, declarative operations (filter, map, reduce) on collections, 
     often with parallelization, leading to more efficient data processing.
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPITest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,10, 20, 5, 2, 8, 9);
		//1. Filter — Select elements matching a condition
		List<Integer> filtered = list.stream()
                .filter(e -> e > 5)
                .collect(Collectors.toList());
		System.out.println(filtered.toString());
		
		//2. Sort — Sort elements in natural order (ascending)
		List<Integer> sorted = list.stream()
		                           .sorted()
		                           .collect(Collectors.toList());
		System.out.println(sorted.toString());
		
		//3. Sort Descending
		List<Integer> sortedDesc = list.stream()
		                               .sorted(Comparator.reverseOrder())
		                               .collect(Collectors.toList());
		System.out.println(sortedDesc.toString());
		
		//4. Map — Transform elements (e.g., multiply by 2)
		List<Integer> doubled = list.stream()
		                            .map(i -> i * 2)
		                            .collect(Collectors.toList());
		System.out.println(doubled.toString());
		
		//5. ForEach — Perform an action on each element (print in this case)
		list.stream().forEach(i -> System.out.print(i+", "));
		
		//6. Count — Count elements matching a condition
		long count = list.stream()
		                 .filter(i -> i > 5)
		                 .count();
		System.out.println("\nCount: "+count);
		
		//7. FindFirst — Get the first element in the stream (optional)
		Optional<Integer> first = list.stream().findFirst();
		System.out.println("first: "+first.orElse(0));
		
		//8. FindAny — Get any element (useful in parallel streams)
		Optional<Integer> any = list.parallelStream().findAny();
		System.out.println("any: "+any.orElse(0));
		
		//9. Max / Min — Find maximum or minimum elements
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println("Max Element: "+max.orElse(0));
		Optional<Integer> min = list.stream().min(Integer::compareTo);
		System.out.println("Min Element: "+min.orElse(0));
		
		//10. Sum & Average
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum: "+sum);
		OptionalDouble average = list.stream().mapToDouble(e-> e).average();
		System.out.println("Average: "+average.orElse(0.0));
		
		//11. Distinct — Remove duplicates (not applicable here, as no duplicates)
		List<Integer> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println("DistinctElements:"+distinctElements.toString());
		
		//12. Collecting into Different Collections
		Set<Integer> setList = list.stream().collect(Collectors.toSet());
		System.out.println("Set list" + setList.toString());
		
		//To a String (joining with commas):
		
		String str = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println("String : " +str);
		
		//13. Reduce — Aggregate elements
		Optional<Integer> product = list.stream()
		                                .reduce((a, b) -> a * b);
		System.out.println("Product of All Elements :"+product.orElse(0));
		
		//14. Skip and Limit — Pagination-like operations
		List<Integer> skip = list.stream().skip(2).collect(Collectors.toList());
		System.out.println("After Skipping Element"+ skip.toString());
		
		List<Integer> limit = list.stream().limit(4).collect(Collectors.toList());
		System.out.println("Limit : "+limit.toString());
		
		//15. Peek — Debug intermediate results
		List<Integer> peeked = list.stream()
				                   .filter(e-> e>5)
				                   .peek(e->System.out.println("Filtered Values :"+e))
				                   .collect(Collectors.toList());
		
		/** 16. Update Elements
		Note: Streams cannot modify source collections directly. But you can create a new updated list using map:

		Example: Increase all elements by 1 */

		List<Integer> updatedElements = list.stream()
		                            .map(i -> i + 1)
		                            .collect(Collectors.toList());
       System.out.println("Updated Elements By 1" +updatedElements.toString());
       
       //To actually update List iterate with loop
       List<Integer> mutableList = new ArrayList<>(list);
		for (int i=0;i<mutableList.size();i++) {
			mutableList.set(i, list.get(i) + 1);
		}
	  System.out.println(mutableList.toString());	
	  
	  /**17. Delete (Remove) Elements
	  Streams cannot modify the source list directly.
	  To remove elements from a mutable list: */

	  List<Integer> modifiableList = new ArrayList<>(list);
	  modifiableList.removeIf(i -> i < 10);
       
 	}

}
