package com.logicBuilding;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String input = "Rupe(s0)h";
		boolean validParenthesesStatus = checkValidParentheses(input);
		if(validParenthesesStatus) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}

	private static boolean checkValidParentheses(String input) {
		char inputArray[] = input.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for (char x : inputArray) {
			if (x == '(') {
				s.push(x);
			}else {
				if(x==')') {
					if(s.isEmpty()) {
						return false;
					}else {
						char lastElement = s.pop();
						if(lastElement!='(') {
							return false;
						}
							
					}
				}
			}
		}
		return s.isEmpty();
	}

}
