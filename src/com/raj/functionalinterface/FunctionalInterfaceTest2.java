package com.raj.functionalinterface;

/**
 * @author Rajendra Singh
 */
@FunctionalInterface
interface MathOperation{
	int operation(int x, int y);
}
public class FunctionalInterfaceTest2 {
	public static void main(String[] args) {
		MathOperation addition = (x,  y) ->  x+y;
		MathOperation subtraction = (x,  y) ->  x-y;
		MathOperation multiplication = (x,  y) ->  x*y;
		
		System.out.println("Addition:"+addition.operation(10, 10));
		System.out.println("Subtraction:"+subtraction.operation(20, 10));
		System.out.println("Multiplication:"+multiplication.operation(4, 8));
	}
}
