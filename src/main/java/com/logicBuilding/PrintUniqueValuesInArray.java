package com.logicBuilding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintUniqueValuesInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 30, 40, 10 };
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		List<Integer> unqiueList = new ArrayList<Integer>();
		for (int n : a) {
			m.put(n, m.getOrDefault(n, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> x : m.entrySet()) {
			if (x.getValue() == 1) {
				unqiueList.add(x.getKey());
			}

		}
		System.out.println(unqiueList);

	}

}
