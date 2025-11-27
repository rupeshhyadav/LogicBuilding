package com.logicBuilding;

public class FindFirstOccAndLastOccOfCharacterInString {

	public static void main(String[] args) {
		String input = "Hello World";
		char inputArray[] = input.toCharArray();
		int firstcount = 0;
		int lastcount = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 'o') {
				firstcount = i;
				break;
			}
		}
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] == 'o') {
				lastcount = i;
				break;
			}
		}
		System.out.println(firstcount);
		System.out.println(lastcount);

	}

}
