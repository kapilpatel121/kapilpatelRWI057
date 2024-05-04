package com.rwi.collection;

public class TestRWiCollection {

	public static void main(String[] args) {
		RWICollection col = new RWICollection();
		System.out.println("Capacity : " + col.capacity());
		System.out.println("Size     : " + col.capacity());
		System.out.println("Elements : " + col);
		col.add(10);
		col.add("Raja");
		col.add(6.7);
		col.add('c');
		System.out.println("Capacity : " + col.capacity());
		System.out.println("Size     : " + col.capacity());
		System.out.println("Elements : " + col);

	}

}
