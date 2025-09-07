package com.raj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamTest {

	public static void main(String[] args) {
	    /**
         * return String  eedf
         * lexicographically sorting 
         */
        List<Character> charList = Arrays.asList('f','d','e','e');
        Map<Character,Integer> map = new HashMap<>();
        for (Character ch : charList) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1,e2) -> e2.getValue() != e1.getValue() ? e2.getValue().compareTo(e1.getValue()) : e1.getKey().compareTo(e2.getKey()));
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<list.size();i++) {
          for(int j=0;j<list.get(i).getValue();j++) {
        	  sb.append(list.get(i).getKey());	
          }
        }
        System.out.println(sb.toString());	
	}
}
