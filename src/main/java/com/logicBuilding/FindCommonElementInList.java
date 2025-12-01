package com.logicBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementInList {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l2.add(10);
		l2.add(20);
		l2.add(40);
		l1.retainAll(l2);
		System.out.println(l1);
		List<Integer> result = l1.stream().filter(x -> l2.contains(x)).collect(Collectors.toList());
		System.out.println(result);

	}

}
