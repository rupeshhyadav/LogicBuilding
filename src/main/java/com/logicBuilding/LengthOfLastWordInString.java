package com.logicBuilding;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		String input = "My name is Rupesh";
		input = input.trim();
		char inputArray[]=input.toCharArray();
		int count =0;
		for(int i=inputArray.length-1;i>=0;i--) {
			if(inputArray[i]!=' ') {
				count++;
			}else {
				System.out.println(count);
				break;
			}
			
		}

	}

}
