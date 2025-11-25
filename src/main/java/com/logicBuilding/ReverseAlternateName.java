package com.logicBuilding;

public class ReverseAlternateName {

	public static void main(String[] args) {
		String input = "My name is Rupesh";
		String words[] = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {
				sb.append(new StringBuilder(words[i]).reverse());
			} else {
				sb.append(words[i]);
			}
		}
		System.out.println(sb);

	}

}
