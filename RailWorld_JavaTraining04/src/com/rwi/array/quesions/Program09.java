package com.rwi.array.quesions;

import java.util.Scanner;

//Java Program to print the largest element in an array
public class Program09 {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		int max=arr[0];
		for (int i = 0; i < size; i++) {
		  if(max<arr[i])
			  max=arr[i];
		}
		System.out.println("largest Element:- "+max);
		
		
	}
}
