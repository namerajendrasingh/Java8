package com.raj.functionalinterface;

/**
 * @author Rajendra Singh
 * 2. Functional Interfaces
 * Need:
       To facilitate lambda expressions, Java 8 introduced the concept of functional interfaces—interfaces 
       with exactly one abstract method, which act as the types for lambda expressions.
 */
@FunctionalInterface
interface MyInterface{
	void executeMethod();
}
public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		MyInterface my = ()->{System.out.println("Functional Approach Execute Operation!");};
		my.executeMethod();
	}

}
