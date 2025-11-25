package com.logicBuilding;

import java.io.InputStream;
import java.util.Arrays;

public class ReverseVowelsFromString {

	public static void main(String[] args) {
		String input = "Rupesh";
		String vowels = "aeiouAEIOU";
		char inputArray[] = input.toCharArray();
		int left = 0;
		int right = inputArray.length - 1;
		char temp;
		while (left < right) {
			if (vowels.indexOf(inputArray[left]) == -1) {
				left++;
			} else if (vowels.indexOf(inputArray[right]) == -1) {
				right--;
			} else {
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(inputArray);

	}

}
