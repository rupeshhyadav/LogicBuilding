package com.logicBuilding;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int a[] = { 14, 23, 30, 44 };
		int b[] = { 4, 11, 30, 45 };
		int c[] = new int[a.length + b.length];
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;

		while (p1 < a.length && p2 < b.length) {
			if (a[p1] < b[p2]) {
				c[p3] = a[p1];
				p3++;p1++;
			}else {
				c[p3]=b[p2];
				p3++;p2++;
			}
		}
		while(p1<a.length) {
			c[p3]=a[p1];
			p3++;p1++;
		}
		while(p2<b.length) {
			c[p3]=b[p2];
			p3++;p2++;
		}
		System.out.println(Arrays.toString(c));

	}

}
