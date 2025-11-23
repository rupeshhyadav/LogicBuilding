package com.logicBuilding;

public class MonotonicArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 6, 12, 20, 35 };
		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 1; i < a.length - 1; i++) {
			if (a[i - 1] < a[i]) {
				decreasing = false;
			} else if (a[i - 1] > a[i]) {
				increasing = false;
			}
		}
		if (increasing || decreasing == true) {
			System.out.println("Monotonic");
		} else {
			System.out.println("Not Monotonic");
		}

	}

}
