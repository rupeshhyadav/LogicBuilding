package com.logicBuilding;

public class NameShortener {

	public static void main(String[] args) {
		String fullName = "Rupesh Kumar Yadav";
		String fullNameArray[] = fullName.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fullNameArray.length - 1; i++) {
			sb.append(fullNameArray[i].charAt(0));
			sb.append(" ");
		}
		sb.append(fullNameArray[fullNameArray.length - 1]);
		System.out.println(sb);

	}

}
