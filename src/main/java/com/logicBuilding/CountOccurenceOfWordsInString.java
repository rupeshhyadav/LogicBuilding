package com.logicBuilding;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfWordsInString {

	public static void main(String[] args) {
		String input = "My name name is Rupesh Rupesh";
		String inputArray[] = input.split(" ");
		Map<String, Integer> m = new HashMap<>();
		for (String s : inputArray) {
			
			if (m.containsKey(s)) {
				m.put(s, m.get(s) + 1);
			}else {
				m.put(s, 1);
			}
		}
		System.out.println(m);

	}

}
