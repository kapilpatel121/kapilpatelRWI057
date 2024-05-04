package com.nt.javv8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer> c = i -> {
			System.out.println("Sqaure of " + i + " is :- " + i * i * i);
		};

		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(15);
		list.add(26);
		list.add(35);
		list.add(19);

		list.forEach(i -> {
			c.accept(i);
		});

	}
}
