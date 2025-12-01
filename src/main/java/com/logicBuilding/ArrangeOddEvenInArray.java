package com.logicBuilding;

import java.util.Arrays;

public class ArrangeOddEvenInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 33, 21, 38, 30, 43 };
		int left = 0;
		int right = a.length - 1;
		int temp;
		while (left < right) {
			while (left < right && a[left] % 2 == 0) {
				left++;
			}
			while (left < right && a[right] % 2 != 0) {
				right--;
			}
			if (left < right) {
				temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
