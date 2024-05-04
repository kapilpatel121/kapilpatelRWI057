package com.rwi.array.quesions;

import java.util.Scanner;

//1) Java Program to copy all elements of one array into another array
public class Program01 {

	public static void main(String[] args) {
		System.out.println("Enter the Size of Array:-");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		
		int arr[] =new int[size];
		int cparr[] =new int[size];
		System.out.println("Enter "+size +" Elements");
		for (int i = 0; i < size; i++) {
			 arr[i]=scn.nextInt();
		}
		System.out.println(" Original array");
		for (int ele : arr)
			System.out.println("element " + ele);
		
		for (int i = 0; i < size; i++) {
			 cparr[i]=arr[i];
		}
		System.out.println("copy of array");
		for (int ele : cparr)
			System.out.println("element " + ele);
	}
	
	
}
