package com.logicBuilding;

public class CharacterCountWithWhiteSpace {

	public static void main(String[] args) {
		String input = " Rupesh  ";
		char inputArray[] = input.toCharArray();
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				continue;
			}
			boolean afterspace = (i < inputArray.length - 1 && inputArray[i + 1] == ' ');
			boolean beforespace = (i < inputArray.length - 1 && inputArray[i - 1] == ' ');
			if (!afterspace && !beforespace) {
				count++;
			}
		}
		System.out.println(count);

	}

}
