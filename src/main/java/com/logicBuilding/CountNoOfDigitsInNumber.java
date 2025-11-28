package com.logicBuilding;

public class CountNoOfDigitsInNumber {

	public static void main(String[] args) {
		int number = 123455;
		int count = 0;
		int lastDigit;
		while (number != 0) {
			lastDigit = number % 10;
			count++;
			number = number / 10;
		}
		System.out.println(count);

	}

}
