package com.logicBuilding;

public class ProductOfMaxTripletWithNegativeNumbers {

	public static void main(String[] args) {
		int a[] = { 1, 4, 11, 5, 9 };
		int largest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		int tlargest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int ssmallest = Integer.MAX_VALUE;
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
			if (x < smallest) {
				ssmallest = smallest;
				smallest = x;
			} else if (x < ssmallest) {
				ssmallest = x;

			}

		}
		int result1 = largest * slargest * tlargest;
		int result2 = largest * smallest * ssmallest;
		System.out.println(Math.max(result1, result2));

	}

}
