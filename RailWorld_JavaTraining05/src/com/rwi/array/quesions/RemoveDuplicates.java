package com.rwi.array.quesions;

import java.util.Scanner;

 // Remove Duplicate  element form an array
public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					arr = RemoveElement(arr, j, --size);
				}
			}
		}

		System.out.println("Result Array");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] RemoveElement(int[] a, int index, int size) {
		for (int i = index; i < size - 1; i++) {
			a[i] = a[i + 1];
		}
		return a;
	}

}