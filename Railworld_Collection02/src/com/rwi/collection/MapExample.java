package com.rwi.collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// Adding elements to the Map
		// using standard put() method
		map.put("priyansh", 10);
		map.put("vishal", 30);
		map.put("sachin", 20);
		map.put("Navneet", 40);
		System.out.println(map);

	}

}
