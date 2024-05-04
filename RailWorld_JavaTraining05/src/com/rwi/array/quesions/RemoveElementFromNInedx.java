package com.rwi.array.quesions;

import java.util.Scanner;

// Remove nth index element form an array
public class RemoveElementFromNInedx
{

	public static void main(String[] args) {

		System.out.println("Enter the Size of Array:-");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println("Enter index to remove an element");
		int index = scn.nextInt();
		size--;
		for(int i=index;i<size;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("Result Array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}