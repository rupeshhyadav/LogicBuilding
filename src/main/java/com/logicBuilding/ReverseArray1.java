package com.logicBuilding;

import java.util.Arrays;

public class ReverseArray1 {

	public static void main(String[] args) {
		int a[] = { 10, 2, 12, 44, 3 };
		int b[]=new int[a.length];
		int revIndex =0;
		for(int i=a.length-1;i>=0;i--) {
			b[revIndex]=a[i];
			revIndex++;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
