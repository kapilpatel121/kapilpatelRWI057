package com.rwi.array.quesions;

import java.util.Scanner;

public class NextLineNext {

	public static void main(String[] args) {

		System.out.println("Enter First String");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(str);
		// scn.next();
		System.out.println("Enter Second String");
		String str1 = scn.nextLine();
		System.out.println(str1);

	}
}