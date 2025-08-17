package com.raj.lambda;
/**
 * @author Rajendra Singh
 * 1. Lambda Expressions
 * Definition:Lambdas enable concise functional programming, making code cleaner and more readable.
 */

public class LambdaTest {

	public static void main(String[] args) {
		// Traditional approach
		Runnable r1 = new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Running with Traditional Approach...");
		    }
		};
		r1.run();
		// With Lambda Expression
		Runnable r2 = () -> System.out.println("Running with Functional Approach...");
		r2.run();
		
	}

}
