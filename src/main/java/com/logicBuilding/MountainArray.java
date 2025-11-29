package com.logicBuilding;

public class MountainArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 15, 23, 3, 10 };
		boolean mountainArrayStatus = checkMountainArray(a);
		if (mountainArrayStatus) {
			System.out.println("Mountain array");
		} else {
			System.out.println("not a Mountain array");
		}

	}

	private static boolean checkMountainArray(int[] a) {
		if (a.length < 3) {
			return false;
		}
		int count = 0;
		while (count + 1 < a.length && a[count] < a[count + 1]) {
			count++;
		}
		while (count + 1 < a.length && a[count] > a[count + 1]) {
			count++;
		}

		if (a.length - 1 == count) {
			return true;
		} else {
			return false;
		}
	}

}
