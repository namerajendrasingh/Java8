package com.raj.leetcode;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FrequenceyOfStringInOrder {

	public static void main(String[] args) {
		String str = "cbacbabcabdddd"; //aaabbcc;
		Map<Character,Integer> map = new LinkedHashMap<>();
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		List<Entry<Character, Integer>> map1= map.entrySet().stream()
				   .sorted((c1,c2)->c2.getValue()-c1.getValue()
						   )
				   .collect(Collectors.toList());
		System.out.println(map1);

	}

}
