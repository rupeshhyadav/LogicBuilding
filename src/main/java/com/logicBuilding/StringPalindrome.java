package com.logicBuilding;

public class StringPalindrome {

	public static void main(String[] args) {
		String input = "nitin";
		boolean checkPalindromeStatus = checkPalindrome(input);
		if (checkPalindromeStatus) {
			System.out.println("Palindrome");

		} else {
			System.out.println("not Palindrome");
		}

	}

	private static boolean checkPalindrome(String input) {
		input = input.toLowerCase();
		char inputArray[] = input.toCharArray();
		int left = 0;
		int right = inputArray.length - 1;
		while (left < right) {
			if (inputArray[left] != inputArray[right]) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
