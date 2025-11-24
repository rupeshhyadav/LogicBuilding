package com.logicBuilding;

public class RemoveNumbersAndAlphabetsFromString {

	public static void main(String[] args) {
		String input = "Ru23pesh";
		char inputArray[] = input.toCharArray();
		StringBuilder num = new StringBuilder();
		StringBuilder alpha = new StringBuilder();
		for (char ch : inputArray) {
			if (Character.isDigit(ch)) {
				num.append(ch);
			} else if (Character.isAlphabetic(ch)) {
				alpha.append(ch);
			}

		}
		System.out.println(num);
		System.out.println(alpha);

	}

}
