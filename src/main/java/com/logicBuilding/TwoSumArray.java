package com.logicBuilding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	public static void main(String[] args) {
		int a[] = { 10, 5, 2, 8, 7, 4, 10 };
		int target = 12;
		int result[] = calculateTwoSum(a, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] calculateTwoSum(int[] a, int target) {
		int diff;
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			diff = target - a[i];
			if (m.containsKey(diff)) {
				int result[] = { m.get(diff), i };
				return result;
			}
			m.put(a[i], i);

		}
		return null;
	}

}
