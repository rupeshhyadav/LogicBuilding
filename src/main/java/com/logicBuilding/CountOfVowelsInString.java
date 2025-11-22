package com.logicBuilding;

public class CountOfVowelsInString {

	public static void main(String[] args) {
		String input = "Rupesh";
		char inputArray[] = input.toCharArray();
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if ((vowels.indexOf(inputArray[i]) != -1)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
