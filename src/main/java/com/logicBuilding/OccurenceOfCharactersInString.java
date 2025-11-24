package com.logicBuilding;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		String input = "arrrsd44ffd";
		char inputArray[] = input.toCharArray();
		Map<Character, Integer> freqmap = new HashMap<>();
		for (char ch : inputArray) {
			if (freqmap.containsKey(ch)) {
				freqmap.put(ch, freqmap.get(ch) + 1);
			} else {
				freqmap.put(ch, 1);
			}
		}
		System.out.println(freqmap);

	}

}
