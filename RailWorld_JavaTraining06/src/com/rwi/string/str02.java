package com.rwi.string;

public class str02 {
	public static void main(String args[]) {
		String s1 = "java";
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// char array to string
		String s3 = new String("Programming");//  Java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}