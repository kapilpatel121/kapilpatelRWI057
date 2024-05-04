package com.rwi.array.quesions;

//Java Program to multiply the two matrices
public class MultiplicationOFMatrix {

	public static void main(String[] args) {

		int rows = 3, cols = 3;

		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		// Initialize matrix b
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int c[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}