package com.rwi.array.quesions;

import java.util.Scanner;

//12) Java Program to print the sum of all the items of the array
public class Program12 {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		
		int arr[] = new int[size];
		int sum=0;
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
			sum+=arr[i];
		}

		System.out.println("Sum of array element " + sum);

	}
}
