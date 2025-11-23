package com.logicBuilding;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String input = "Rupesh";
		char inputArray[] = input.toCharArray();
		Stack<Character> st = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		for (char ch : inputArray) {
			st.push(ch);
		}
		while (!st.isEmpty()) {
			char x = st.pop();
			sb.append(x);
		}
		System.out.println(sb);

	}

}
