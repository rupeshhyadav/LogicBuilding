package com.logicBuilding;

import java.util.Arrays;

public class CheckTwoArraysAreEqual {

	public static void main(String[] args) {
		int a[] = { 20, 24, 56, 6 };
		int b[] = { 20, 24, 6, 56 };
		if (a.length != b.length) {
			System.out.println("Not equal");
		}
		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			System.out.println("equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
