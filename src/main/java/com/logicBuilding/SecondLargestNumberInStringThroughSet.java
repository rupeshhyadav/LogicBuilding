package com.logicBuilding;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumberInStringThroughSet {

	public static void main(String[] args) {
		int a[] = { 10, 13, 19, 45, 33 };
		TreeSet<Integer> s = new TreeSet<>();
		for (int x : a) {
			s.add(x);
		}
		System.out.println(s);
		s.pollLast();
		System.out.println(s);
		System.out.println(s.getLast());

	}

}
