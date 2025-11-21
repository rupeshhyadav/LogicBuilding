package com.logicBuilding;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 2, 45, 8, 33, 10, 12 };
		int largestNo = Integer.MIN_VALUE;
		for(int x : a) {
			if(x>largestNo) {
				largestNo=x;
			}
		}
		System.out.println(largestNo);

	}

}
