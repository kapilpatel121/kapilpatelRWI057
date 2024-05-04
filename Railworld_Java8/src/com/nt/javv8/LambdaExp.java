package com.nt.javv8;

public class LambdaExp {

	public static void main(String[] args) {
		
		Interf i=(a,b)->a+b;
		
		System.out.println("Sum of two numbers is :-"+i.add(10, 20));
	}
}
