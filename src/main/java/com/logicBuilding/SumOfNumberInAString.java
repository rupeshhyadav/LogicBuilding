package com.logicBuilding;

public class SumOfNumberInAString {

	public static void main(String[] args) {
		String input = "My name 10 is 32 Rupesh";
		String words[] = input.split(" ");
		int sum = 0;
		for (String word : words) {
			try {
				int x = Integer.parseInt(word);
				sum += x;
			} catch (NumberFormatException e) {
				System.err.println(e.getMessage());

			}
		}
		System.out.println(sum);

	}

}
