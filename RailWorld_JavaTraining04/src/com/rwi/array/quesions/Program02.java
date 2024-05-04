package com.rwi.array.quesions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//2) Java Program to find the frequency of each element in the array
public class Program02 {

	public static void main(String[] args) {
		
        Map<Integer, Integer> map = new HashMap<>();
		System.out.println("Enter the Size of Array:-");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		
		int arr[] =new int[size];
		System.out.println("Enter "+size +" Elements");
		for (int i = 0; i < size; i++) {
			 arr[i]=scn.nextInt();
		}
		System.out.println("array enter by user");
		for (int ele : arr)
			System.out.println("element " + ele);
		
		for (int i = 0; i < size; i++) {
		if(map.containsKey(arr[i])) {
		  map.put(arr[i], map.get(arr[i])+1);
		}else {
			map.put(arr[i],1);
		}
		}
		
		System.out.println("Element Frequency");
		System.out.println(map);
	}
}
