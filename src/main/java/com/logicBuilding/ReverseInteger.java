package com.logicBuilding;

public class ReverseInteger {

	public static void main(String[] args) {
		int a= 12330344;
		int lastDigit;
		int reverse=0;
		while(a!=0) {
			lastDigit=a%10;
			reverse=reverse*10+lastDigit;
			a=a/10;
		}
		System.out.println(reverse);

	}

}
