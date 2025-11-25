package com.logicBuilding;

import java.util.ArrayList;

public class EvenOddFromMixedArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Rupesh");
		al.add("Kajol");
		al.add(30);
		al.add(33);
		al.add(43);

		for (Object o : al) {
			if (o instanceof Integer) {
				int x = ((Integer) o).intValue();
				if (x % 2 == 0) {
					System.out.println("Even is :" + x);
				} else {
					System.out.println("Odd is :" + x);
				}
			}
		}

	}

}
