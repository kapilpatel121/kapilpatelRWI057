package com.rwi.array.quesions;

import java.util.Scanner;

// 7) Java Program to print the elements of an array present on even position
public class Program07 {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("element at even position");
		for (int i = 0; i < size; i++) {
			if(! (i%2==0))
			System.out.println("element " + arr[i]);
		}
	}
}
