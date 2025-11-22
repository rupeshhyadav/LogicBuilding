package com.logicBuilding;

public class OccurenceOfCharactersInStringWithoutMap {

	public static void main(String[] args) {
		String input = "Tomorrow";
		char inputArray[] = input.toCharArray();
		int a[] = new int[256];
		for (int ch : inputArray) {
			a[ch] = a[ch] + 1;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.println((char) i + " " + a[i]);
			}
		}

	}

}
