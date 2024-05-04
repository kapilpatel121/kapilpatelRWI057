package com.rwi.array.quesions;

//Java Program to determine whether two matrices are equal
public class MatrixIsEqualOrNot {

	public static void main(String[] args) {

		int rows = 3, cols = 3;
		String flag = "Equal";
		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Initialize matrix b
		//int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] != b[i][j]) {
					flag = "Not Equal";
					break;
				}
			}

		}
		System.out.println("The given Matrix is :- " + flag);
	}
}