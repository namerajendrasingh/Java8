package com.raj.ds;

import java.util.Stack;

public class StackDataStructure {

	public static void main(String[] args) {
		String str = "Hello Java8";
		System.out.println(reverseString(str));
	}

	private static StringBuilder reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		for (Character character : str.toCharArray()) {
			stack.push(character);
		}
		//Now popping each element from stack and store back into new String;
		StringBuilder sb = new StringBuilder("");
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb;
	}
}
