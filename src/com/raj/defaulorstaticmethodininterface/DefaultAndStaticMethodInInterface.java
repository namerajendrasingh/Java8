package com.raj.defaulorstaticmethodininterface;

/**
 * @author Raj Singh
 * 6. Default and Static Methods in Interfaces
   Need:
	Evolving interfaces without breaking existing implementations was difficult. 
	Default methods allow interfaces to define concrete methods, enabling backward compatibility. 
	Static methods allow utility methods in interfaces.
 */
interface Calculator {
	default void printHello() {
		System.out.println("Hello from Default Method!");
	}

	static int add(int a, int b) {
		return a + b;
	}
}

public class DefaultAndStaticMethodInInterface implements Calculator{
    public void show() {
    	printHello(); // now directly you can call default method 
    }
	public static void main(String[] args) {
		int result = Calculator.add(10, 20);
		System.out.println("Result:"+result);
		new DefaultAndStaticMethodInInterface().printHello();
		new DefaultAndStaticMethodInInterface().show();
	}

}
