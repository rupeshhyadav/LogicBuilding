package com.logicBuilding;

public class LeaderArray {

	public static void main(String[] args) {
		int a[] = { 10, 1, 23, 17, 3, 4 };
		int maxRight = a[a.length - 1];
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > maxRight) {
				maxRight = a[i];
				System.out.println(maxRight);
			}

		}

	}

}
