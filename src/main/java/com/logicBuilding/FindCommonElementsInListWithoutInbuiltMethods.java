package com.logicBuilding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementsInListWithoutInbuiltMethods {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l2.add(10);
		l2.add(60);
		l2.add(40);
		Set<Integer> resultSet = new HashSet<Integer>();
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l2.size(); j++) {
				if (l1.get(i) == l2.get(j)) {
					resultSet.add(l1.get(i));
				}
			}
		}
		System.out.println(resultSet);

	}

}
