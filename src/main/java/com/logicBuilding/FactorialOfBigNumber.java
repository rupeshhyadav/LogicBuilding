package com.logicBuilding;

import java.math.BigInteger;

public class FactorialOfBigNumber {

	public static void main(String[] args) {
		int a = 50;
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i < a; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println(result);

	}

}
