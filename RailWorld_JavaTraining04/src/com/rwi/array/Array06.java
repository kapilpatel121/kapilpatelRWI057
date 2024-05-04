package com.rwi.array;

//passing Array to the method and get the array as return type in Java
public class Array06 {
	
	public static int[] graceMarks(int num[]) {
		for(int i=0;i<num.length;i++) {
			num[i]+=5;
		}
		return num;	
	}
	public static void main(String args[]) {
		int marks[] = {33,45,55,78,81,29};
		
		int  upgratedMarks[]=graceMarks(marks);
		
		for(int m:upgratedMarks)
			System.out.println(m);
	}
}
