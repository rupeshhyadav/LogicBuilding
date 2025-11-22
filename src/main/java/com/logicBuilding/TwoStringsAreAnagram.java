package com.logicBuilding;

import java.util.Arrays;

public class TwoStringsAreAnagram {

	public static void main(String[] args) {
		String input1 = "abc";
		String input2 = "asb";
		if (input1.length() == input2.length()) {
			char inputArray1[] = input1.toCharArray();
			char inputArray2[] = input2.toCharArray();
			Arrays.sort(inputArray1);
			Arrays.sort(inputArray2);
			if (Arrays.equals(inputArray1, inputArray2)) {
				System.out.println("Anagram");

			}else {
				System.out.println("Not Anagram");
			}
		}else {
			System.out.println("Not Anagram");
		}

	}

}
