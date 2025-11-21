package com.logicBuilding;

import java.util.Arrays;

public class ReverseArray2 {

	public static void main(String[] args) {
		int a[] = { 10, 2, 12, 44, 3 };
		System.out.println(Arrays.toString(a));
		int left = 0;
		int right = a.length - 1;
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(a));
	}

}
