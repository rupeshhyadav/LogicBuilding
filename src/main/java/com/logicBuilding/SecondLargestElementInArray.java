package com.logicBuilding;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int a[] = { 11, 15, 34, 2, 10, 9, 18 };
		int largest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		for (int x : a) {
			if (x > largest) {
				slargest = largest;
				largest = x;

			} else if (x > slargest) {
				slargest = x;

			}

		}
		System.out.println(slargest);

	}

}
