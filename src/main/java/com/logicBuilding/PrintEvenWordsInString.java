package com.logicBuilding;

public class PrintEvenWordsInString {

	public static void main(String[] args) {
		String input = "My name is Rupesh Kumar Yadav yes";
		String words[]=input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			if(word.length()%2==0) {
				sb.append(word+ " ");
			}
		}
		System.out.println(sb);

	}

}
