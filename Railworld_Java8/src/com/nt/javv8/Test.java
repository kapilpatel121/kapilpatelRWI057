package com.nt.javv8;

public class Test implements Child{

	@Override
	public  int add(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		Test t =new Test();
		int sum=t.add(20, 45);
		System.out.println("Sum is :- "+sum);
	   
		t.display();
		t.show();
	}
}
