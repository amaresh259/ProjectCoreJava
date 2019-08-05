package com.core.practiceprogramme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyImpl {

	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap<>();
		//Map<Integer, String> map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "xyz");
		map.put(1, "bvc");
		
		//map.remove(3);
		
		Set s = map.entrySet();
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			//map.remove(3);
			System.out.println("value "+it.next());
			it.remove();
		}
		
		//List li = new ArrayList();
		List li = new CopyOnWriteArrayList();
		li.add(1);
		li.add(3);
		li.add(8);
		li.add(2);
		
		
		
		Iterator i = li.iterator();
		//li.remove(new Integer(3));
		while(i.hasNext()) {
			
			System.out.println(i.next());
			//i.remove();
		}
		System.out.println(li);
	}

}
 