package com.logicBuilding;

public class ReverseAStringUsingOnlyStringClass {

	public static void main(String[] args) {
		String input = "Rupesh";
		String reverseInput = " ";
		char inputArray[] = input.toCharArray();
		for (int i = inputArray.length - 1; i >= 0; i--) {
			reverseInput = reverseInput + inputArray[i];
		}
		System.out.println(reverseInput);

	}

}
