package com.logicBuilding;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetterFromString {

	public static void main(String[] args) {
		String input = "sadaett";
		char inputArray[] = input.toCharArray();
		Set<Character> s = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char ch : inputArray) {
			if(s.add(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb);

	}

}
