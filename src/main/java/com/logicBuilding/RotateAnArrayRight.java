package com.logicBuilding;

import java.util.Arrays;

public class RotateAnArrayRight {

	public static void main(String[] args) {
		int a[] = { 12, 34, 2, 56, 39, 19 };
		int k = 3;
		int left = 0;
		int right = a.length - 1;
		System.out.println(Arrays.toString(a));
		a = rotateArray(a, left, right);
		System.out.println(Arrays.toString(a));
		a = rotateArray(a, left, k-1);
		System.out.println(Arrays.toString(a));
		a = rotateArray(a, k, a.length-1);
		System.out.println(Arrays.toString(a));

	}

	private static int[] rotateArray(int[] a, int left, int right) {
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		return a;
	}

}
