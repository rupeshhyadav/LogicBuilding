package com.logicBuilding;

public class ChangingKeysInString {

	public static void main(String[] args) {
		String input = "abBaacddd";
		input = input.toLowerCase();
		int count = 0;
		char inputArray[] = input.toCharArray();
		char lastKey = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			char currentKey = inputArray[i];
			if (currentKey != lastKey) {
				count++;
			}
			lastKey = currentKey;
		}
		System.out.println(count);

	}

}
