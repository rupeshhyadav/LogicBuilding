package com.logicBuilding;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfSpecialCharactersInString {

	public static void main(String[] args) {
		String input = "ar$*#rsd4$$fd";
		char inputArray[] = input.toCharArray();
		Map<Character, Integer> freqmap = new HashMap<>();
		for (char ch : inputArray) {
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')||(ch>='0' && ch<='9'))) {
				if (freqmap.containsKey(ch)) {
					freqmap.put(ch, freqmap.get(ch) + 1);
				} else {
					freqmap.put(ch, 1);
				}
			}
		}
		System.out.println(freqmap);

	}

}
