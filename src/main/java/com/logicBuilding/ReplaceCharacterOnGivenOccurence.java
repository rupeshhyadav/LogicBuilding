package com.logicBuilding;

public class ReplaceCharacterOnGivenOccurence {

	public static void main(String[] args) {
		String input = "Tommorow";
		char inputArray[] = input.toCharArray();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 'o') {
				count++;
				if (count == 2) {
					sb.append("%");
					continue;
				}
			}
			sb.append(inputArray[i]);

		}
		System.out.println(sb);

	}

}
