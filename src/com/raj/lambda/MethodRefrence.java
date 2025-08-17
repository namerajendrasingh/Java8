package com.raj.lambda;

import java.util.function.Consumer;

/**
 * @author Rajendra Singh
 * 3. Method References
		Need:
		Further reduce verbosity(शब्दाडंबर) and improve code readability by referencing existing methods directly 
		instead of using lambdas.
 */
public class MethodRefrence {

	public static void main(String[] args) {
		Consumer<String> printer = System.out::println;
		printer.accept("Hello");  
	}

}
