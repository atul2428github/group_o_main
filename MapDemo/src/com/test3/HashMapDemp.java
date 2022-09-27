package com.test3;

import java.util.HashMap;

public class HashMapDemp {
	public static void main (String []args) {
		HashMap map = new HashMap();
		map.put("Shubham", 20);
		System.out.println(map.put("Samir", 15));
		map.put("Vilas", 16);
		map.put("Prakash", 18);
		System.out.println(map.put("Samir",25));
		map.put("Shubham", 19);
		System.out.println(map);
	
		
	}

}
