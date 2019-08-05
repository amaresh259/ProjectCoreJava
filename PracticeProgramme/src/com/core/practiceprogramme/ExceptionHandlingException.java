package com.core.practiceprogramme;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExceptionHandlingException {

	public static void main(String[] args) {

		try {
			
			int a = 2;
			System.out.println("Try:::"+a);
			Map<Integer, String> map = new HashMap<>();
			
			map.put(2, "abc");
			map.put(3, "abcd");
			map.put(null, "abcde");
			
			for(Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getValue());
				System.out.println(entry.toString());
			}
			
		} finally {
			int b = 3;
			System.out.println("finally:::"+b);
		}
	}

}
