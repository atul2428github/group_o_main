package com.test;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
public static void main (String []args) {
	HashMap <Integer, String >map= new HashMap <Integer, String >();
	map.put(101, "Ashok");
	map.put(102, "Ram");
	map.put(103, "Akshay");
	// 2nd way to print - for each loop
	
	//first get the key of all map
	Set<Integer> s=map.keySet();
	for (int i:s) {
		System.out.println("Key>>"+i);
		System.out.println("Value>>"+map.get(i));
	}
}
}
