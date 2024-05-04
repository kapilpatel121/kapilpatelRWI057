package com.nt.javv8;

@FunctionalInterface
public interface Child extends Parent {

	//public int sum(int a,int b,int c);
	
	default void show() {
		System.out.println("hii");
	}
}
