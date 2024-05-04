package com.rwi.array.quesions;


import java.util.Scanner;

//Program to left rotate the elements of an array
public class Program03 {

	public static void main(String[] args) {
		
       System.out.println("Enter the Size of Array:-");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		  //n determine the number of times an array should be rotated  
		int n=3;
		int arr[] =new int[size];
		System.out.println("Enter "+size +" Elements");
		for (int i = 0; i < size; i++) {
			 arr[i]=scn.nextInt();
		}
		System.out.println("input array");
		for (int ele : arr)
			System.out.println("element " + ele);
		 //rotate elements n time
		for(int i=0;i<n;i++) {
		int j,first;
		first=arr[0];
		//rortate element at one position left
		for(j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[j]=first;
		}
		System.out.println("Result Array");
		for (int ele : arr)
			System.out.println("element " + ele);
	}
}
