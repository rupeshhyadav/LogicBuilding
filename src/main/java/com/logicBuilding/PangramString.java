package com.logicBuilding;

public class PangramString {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		boolean checkPangramStatus = checkPangram(input);
		if(checkPangramStatus) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not Pangram");
		}

	}

	private static boolean checkPangram(String input) {
		if(input.length()<26) {
			return false;
		}
		for(char i='a';i>='z';i++) {
			if(input.indexOf(i)<0) {
				return false;
			}
		}
		return true;
	}

}
