package com.logicBuilding;

import java.util.Arrays;

public class ReverseHalfArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 23, 98, 5 };
		int mid = a.length / 2;
		int temp;
		int left = 0;
		int right = mid-1;
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
