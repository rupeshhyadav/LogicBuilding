package com.logicBuilding;

public class ProductOfMaxTriplet {

	public static void main(String[] args) {
		int a[] = { 1, 4, 11, 5, 9 };
		int largest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		int tlargest = Integer.MIN_VALUE;
		for (int x : a) {
			if (x > largest) {
				tlargest = slargest;
				slargest = largest;
				largest = x;

			} else if (x > slargest) {
				tlargest = slargest;
				slargest = x;

			} else if (x > tlargest) {
				tlargest = x;

			}

		}
		System.out.println(largest * slargest * tlargest);

	}

}
