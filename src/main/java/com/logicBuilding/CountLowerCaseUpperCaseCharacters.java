package com.logicBuilding;

public class CountLowerCaseUpperCaseCharacters {

	public static void main(String[] args) {
		String input = "Rupesh Yadav";
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		char inputArray[] = input.toCharArray();
		for (char ch : inputArray) {
			if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
		}
		System.out.println(lowerCaseCount);
		System.out.println(upperCaseCount);

	}

}
