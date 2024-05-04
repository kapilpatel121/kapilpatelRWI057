package com.rwi.array.quesions;

import java.util.Scanner;

// Find First,Second ,3rd Largest Number in an Array
public class LargestElements {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		
		int large,slarge,tlarge,i;
		large=0;
		slarge=0;
		tlarge=0;
		for ( i = 0; i < size; i++) {
			 if(large<arr[i] ) {
				 tlarge=slarge;
				 slarge=large;
				 large=arr[i]; 
			 }else if(slarge<arr[i] && large!=arr[i]) {
				 tlarge=slarge;
				 slarge=arr[i];
			 }else if(tlarge<arr[i] && large!=arr[i] && slarge!=arr[i]) {
				 tlarge=arr[i];
			 }
		}
		System.out.println("Largest element of Array:- "+ large);
		System.out.println("Second Largest element of Array:- "+ slarge);
		System.out.println("Third Largest element of Array:- "+ tlarge);
		
}
		}