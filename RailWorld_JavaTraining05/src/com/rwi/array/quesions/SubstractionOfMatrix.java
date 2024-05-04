package com.rwi.array.quesions;

//Java Program to subtract the two matrices
public class SubstractionOfMatrix {

	public static void main(String[] args) {

		int rows = 3, cols = 3;

		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Initialize matrix b
		int b[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 14, 18 } };
		int c[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
					c[i][j] = b[i][i] - a[i][j];
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