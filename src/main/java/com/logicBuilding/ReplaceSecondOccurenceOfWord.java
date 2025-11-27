package com.logicBuilding;

import java.util.HashMap;
import java.util.Map;

public class ReplaceSecondOccurenceOfWord {

	public static void main(String[] args) {
		String input = "France is is a good good country";
		String words[] = input.split(" ");
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String word : words) {
			m.put(word, m.getOrDefault(word, 0) + 1);
			if (m.get(word) == 2) {
				sb.append("$$" + " ");
			} else {
				sb.append(word + " ");
			}
		}
		System.out.println(sb);

	}

}
