package com.logicBuilding;

public class SecondLargestNumberInString {

	public static void main(String[] args) {
		String input = "Ru3589pe2sh";
		char inputArray[] = input.toCharArray();
		int num;
		int largest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		for (char ch : inputArray) {
			if (Character.isDigit(ch)) {
				num = ch - '0';
				if (num > largest) {
					slargest = largest;
					largest = num;
				} else if (num > slargest) {
					slargest = num;
				}

			}

		}
		System.out.println(slargest);

	}

}
