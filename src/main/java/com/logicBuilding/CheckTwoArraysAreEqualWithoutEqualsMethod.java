package com.logicBuilding;

import java.util.Arrays;

public class CheckTwoArraysAreEqualWithoutEqualsMethod {

	public static void main(String[] args) {
		int a[] = { 11, 45, 23, 56 };
		int b[] = { 11, 45, 56, 23 };
		if (a.length != b.length) {
			System.out.println("not equal");
		}
		Arrays.sort(a);
		Arrays.sort(b);
		boolean isSame = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				isSame = false;
				break;
			}
		}
		if (isSame) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

}
