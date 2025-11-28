package com.logicBuilding;

public class TransposeArrayMatrix {

	public static void main(String[] args) {
		int a[][] = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		int b[][] = new int[3][2];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.print(a[row][col]);
			}
			System.out.println(" ");
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				b[col][row] = a[row][col];
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println(" ");
		}

	}

}
