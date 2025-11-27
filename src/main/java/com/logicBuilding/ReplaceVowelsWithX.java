package com.logicBuilding;

public class ReplaceVowelsWithX {

	public static void main(String[] args) {
		String input = "Rupesh";
		String vowels = "aeiouAEIOU";
		char inputArray[] = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < inputArray.length; i++) {
			if (vowels.indexOf(inputArray[i]) != -1) {
				sb.append("X");
			} else {
				sb.append(inputArray[i]);
			}
		}
		System.out.println(sb);

	}

}
