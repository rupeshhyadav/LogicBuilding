package com.logicBuilding;

public class PalindromeNumberWithStringBuilder {

	public static void main(String[] args) {
		int num = 1241;
		String numString = Integer.toString(num);
		StringBuilder i = new StringBuilder(numString);
		String reverseString = i.reverse().toString();
		if (numString.equals(reverseString)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}

	}

}
