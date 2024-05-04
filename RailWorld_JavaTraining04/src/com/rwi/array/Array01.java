package com.rwi.array;

public class Array01 {

	public static void main(String[] args) {
		int num[] = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		for (int i = 0; i < num.length; i++)
			System.out.println("element " + i + " " + num[i]);

		System.out.println("----------------------------");
		int a[] = { 1, 2, 3, 4, 5 };
		for (int n : a)
			System.out.println("element "+ n);
	}

}
