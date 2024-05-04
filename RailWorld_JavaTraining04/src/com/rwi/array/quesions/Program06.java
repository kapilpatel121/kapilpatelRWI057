package com.rwi.array.quesions;

import java.util.Scanner;

//8) Java Program to print the elements of an array in reverse order
public class Program06 {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("input array");
		for (int i = size-1; i >=0; i--) {
			System.out.println("element " + arr[i]);
		}
	}
}
