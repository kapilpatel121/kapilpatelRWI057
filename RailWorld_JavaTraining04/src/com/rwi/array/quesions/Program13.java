package com.rwi.array.quesions;

import java.util.Scanner;

//12)Java Program to right rotate the elements of an array
public class Program13 {

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
		for (int ele:arr) {
			System.out.print(ele +" " );
		}
		int j,n=3;
		for(int i=0;i<n;i++) {
		size--;
		int last=arr[size-1];
		for( j=size-1;j>0;j--) {
			arr[j]=arr[j-1];
		}
		arr[size-1]=last;
		}
		
		System.out.println("Result Array");
		for (int ele:arr) {
			System.out.print(ele +" " );
		}

	}
}
