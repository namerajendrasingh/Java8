package com.raj.ds;

public class Test {

	public static void main(String[] args) {
	//aaa bb cc dd aaa ff -> a3b2c2d2a3f2
		String str = "aaabbccddaaaff";	
		String finalString = coutnFrequencyInOrder(str);
		System.out.println("final:"+finalString);
		System.out.println("coutnFrequencyInOrder2 -> "+coutnFrequencyInOrder2(str));
		System.out.println("coutnFrequencyInOrder3 -> "+coutnFrequencyInOrder3(str));
	}
  private static String coutnFrequencyInOrder3(String str) {
		char ch = str.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<str.length();i++) {
			if(ch != str.charAt(i)) {
				sb.append(ch).append(count);
				ch = str.charAt(i);
				count =1;
			}else {
				count++;
			}
		}
		return sb.toString();
	}
  //aaabbccddaaaff
	private static String coutnFrequencyInOrder( String str) {
		StringBuilder sb= new StringBuilder();
		int count = 1;
		 for(int i=0;i<str.length();i++) {
			 for(int j=i+1;j<str.length();j++){
				 if(str.charAt(i) == str.charAt(j)) {
					 count++;
				 }else {
					 sb.append(str.charAt(i)).append(count);
					 count = 1;
					 i=j-1;
					 break;
				 }
			 }
			 if(i == str.length()-1) 
				 sb.append(str.charAt(i)).append(count);
		 }
		 
		 return sb.toString();
		
	}	
	
	private static String coutnFrequencyInOrder2(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				sb.append(str.charAt(i-1)).append(count);
				count = 1;
			} else {
				count++;
			}
		  }
		sb.append(str.charAt(str.length()-1)).append(count);
		return sb.toString();
	}
}
