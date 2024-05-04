package com.rwi.array.quesions;

//32) Java Program to find the frequency of odd & even numbers in the given matrix
public class FrequencyOFEvenOdd {

	public static void main(String[] args) {

		int rows = 3, cols = 3;
		// Initialize matrix a
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
       int odd=0,even=0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j]%2==0) {
					even++;
				}else
					odd++;
			}

		}
		
		System.out.println("No of even elements in matrix :- " + even);
		System.out.println("No of odd elements in matrix :- " + odd);
	}
}