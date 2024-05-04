package com.rwi.array.quesions;

//Java Program to sum the two matrices
public class SumOfMatrixRowsColums {

	public static void main(String[] args) {

		int rows = 3, cols = 3;

		// Initialize matrix a
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sumRow, sumCol;
		for (int i = 0; i < rows; i++) {
			sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.print(sumRow + " \n");
		}
		for (int i = 0; i < cols; i++) {
			sumCol = 0;
			for (int j = 0; j < rows; j++) {
				sumCol = sumCol + arr[j][i];
			}
			System.out.print(sumCol + " ");
		}
	}
}