package com.nt.javv8;

public interface I {
 
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("m3 method implementation");
	}
}
