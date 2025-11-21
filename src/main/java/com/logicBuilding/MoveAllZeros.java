package com.logicBuilding;

import java.util.Arrays;

public class MoveAllZeros {

	public static void main(String[] args) {
		int a[] = { 11, 0, 14, 0, 23, 0, 0, 33 };
		int swap=0;int temp;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				temp=a[i];
				a[i]=a[swap];
				a[swap]=temp;
				swap++;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
