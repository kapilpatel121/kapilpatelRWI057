package com.rwi.array.quesions;

import java.util.Scanner;

//Java Program to sort the elements of an array in ascending order
public class SortAsc {

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("input Array");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		
		int temp;
		for (int i = 0; i < size-1; i++) {
			for (int j = i + 1; j < size; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Result Array");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

	}
}
