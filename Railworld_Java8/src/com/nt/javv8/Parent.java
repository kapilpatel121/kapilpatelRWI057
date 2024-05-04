package com.nt.javv8;

@FunctionalInterface
public interface Parent {

	public int add(int a,int b);
	default void display() {
		System.out.println("hello Techies");
	}
}
