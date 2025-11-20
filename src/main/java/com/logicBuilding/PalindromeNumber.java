package com.logicBuilding;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 1341;
		int lastDigit;
		int reverse=0;
		int copy=num;
		
		while(copy!=0) {
			lastDigit=copy%10;
			reverse = reverse*10+lastDigit;
			copy=copy/10;
		}
		if(reverse-num==0) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}

	}

}
