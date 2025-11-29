package com.logicBuilding;

public class ReverseOnlyFirstWordOfString {

	public static void main(String[] args) {
		String input = "My name is Rupesh";
		String words[] = input.split(" ", 2);
		StringBuilder sb = new StringBuilder();
		char wordArray[] = words[0].toCharArray();
		for (char ch : wordArray) {
			sb.append(ch).reverse();
		}
		sb.append(" ");
		sb.append(words[1]);
		System.out.println(sb);

	}

}
