package com.logicBuilding;

import java.util.HashMap;
import java.util.Map;

public class ReverseaMap {

	public static void main(String[] args) {
		Map<String, Integer> originalMap = new HashMap<String, Integer>();
		Map<Integer, String> reverseMap = new HashMap<Integer, String>();
		originalMap.put("Rupesh", 10);
		originalMap.put("Kajol", 20);
		originalMap.put("Uday", 30);

		for (Map.Entry<String, Integer> e : originalMap.entrySet()) {
			reverseMap.put(e.getValue(), e.getKey());
		}
		System.out.println(originalMap);
		System.out.println(reverseMap);

	}

}
