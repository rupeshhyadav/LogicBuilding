package com.logicBuilding;

public class LargestAndSmallestWordInString {

	public static void main(String[] args) {
		String input = "My name is Rupesh Engineer";
		String words[] = input.split(" ");
		String smallest = words[0];
		String largest = words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<smallest.length()) {
				smallest=words[i];
			}else if(words[i].length()>largest.length()) {
				largest=words[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}
