package com.rwi.array.quesions;

import java.util.Scanner;

//Program to print the duplicate elements of an array
public class Program04 {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		// n determine the number of times an array should be rotated
		int n = 3;
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("input array");
		for (int ele : arr)
			System.out.println("element " + ele);
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		} }
}
