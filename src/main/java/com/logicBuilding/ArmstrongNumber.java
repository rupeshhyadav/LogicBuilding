package com.logicBuilding;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 143;
		int lastDigit;
		int copy = a;
		int arm = 0;
		while(copy!=0) {
			lastDigit=copy%10;
			arm=arm+(lastDigit*lastDigit*lastDigit);
			copy=copy/10;
		}
		if(a==arm) {
			System.out.println("It is armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}

	}

}
