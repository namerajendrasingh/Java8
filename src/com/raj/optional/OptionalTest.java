package com.raj.optional;

import java.util.Optional;

/**
 * @author Raj Singh
 * 5. Optional Class
  Need:
     NullPointerExceptions were common in Java, as was boilerplate null checking. 
     Optional wraps values that may be absent, 
     providing safe methods to handle potential null values.
     Reduces bugs and makes the intent clearer.
 */
public class OptionalTest {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Hello");
		optional.ifPresent(System.out::println);

		Optional<String> empty = Optional.empty();
		System.out.println(empty.orElse("Default"));

	}

}
