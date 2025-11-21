package com.logicBuilding;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 33;
		boolean isPrime = false;
		if (n == 0 && n == 1) {
			isPrime = true;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				isPrime = true;
				break;
			}
		}
		if(!isPrime) {
			System.out.println("It is prime");
		}else {
			System.out.println("It is not prime");
		}

	}

}
