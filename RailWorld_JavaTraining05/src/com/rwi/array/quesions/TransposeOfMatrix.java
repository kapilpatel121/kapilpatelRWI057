package com.rwi.array.quesions;

//Java Program to sum the two matrices
public class TransposeOfMatrix {

	public static void main(String[] args) {

		int rows = 3, cols = 3;

		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
         int b[][]=new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j]=a[j][i];
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
	}
}