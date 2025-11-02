package com.raj.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//Find sum
		Integer sum1 = list.stream().collect(Collectors.summingInt(Integer::intValue));
		list.stream().reduce(0,Integer::sum);
		list.stream().mapToInt(Integer:: intValue).sum();
		
		//Suppose you have a List<Employee> and want to sum all salaries:
			//int totalSalary = employees.stream()
			 //   .mapToInt(Employee::getSalary)
			  //  .sum();
		
		String str = "madam";
		//1. Reverse a String without StringBuffer/StringBuilder
		String reverseString = reverseString(str);
	    System.out.println("Reverse of String :"+reverseString);
	    //2.Now reverse each word in order
	    String reverseStringInOrder = reverseStringInOrder(str);
	    System.out.println("Reverse of String In Order :"+reverseStringInOrder);
	    //3. Check String is Palindrome or not
	    boolean isPalindrome = isStringPalindrome(str);
	    System.out.println("Is Pailindrome :"+isPalindrome);
	    //4. Find Duplicate Character in a String
	    printDuplicateChars(str);
	}

	private static void printDuplicateChars(String str) {
	 	
	}

	private static boolean isStringPalindrome(String str) {
        char ch[] = str.toCharArray();
        int left =0,right=ch.length-1;
        while(left < right) {
         if(ch[left++] != ch[right--])
        	 return false;
        }
		return true;
	}

	private static String reverseStringInOrder(String str) {
		 String arr[] = str.split(" ");
		 String s="";
		 for(int i=0;i<arr.length;i++) 
		    s+=	reverseString(arr[i])+" ";
		return s;
	}

	private static String reverseString(String str) {
		char ch[] = str.toCharArray();
		int left = 0, right=ch.length-1;
		while(left < right) {
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			left++;
			right--;
		}
		return new String(ch);
	}

}
 