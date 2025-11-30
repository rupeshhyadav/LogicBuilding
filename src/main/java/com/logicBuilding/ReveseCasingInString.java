package com.logicBuilding;

public class ReveseCasingInString {

	public static void main(String[] args) {
		String input = "Rupesh Yadav";
		char inputArray[] = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char ch : inputArray) {
			if (Character.isLowerCase(ch)) {

				sb.append(Character.toUpperCase(ch));
			} else {

				sb.append(Character.toLowerCase(ch));
			}
		}
		System.out.println(sb);

	}

}
