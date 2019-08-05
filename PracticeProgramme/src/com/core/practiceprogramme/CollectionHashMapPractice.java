package com.core.practiceprogramme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionHashMapPractice {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
	    map.put(1, "4");
	    map.put(2, "5");
	    map.put(3, "6");
	    map.putIfAbsent(4, "5");
	    System.out.println(map);
	    Map<Integer, String> map1 = new HashMap<Integer, String>();
	    map.replace(2, "8");
	    map1 = map;
	    System.out.println(map.entrySet());
	    System.out.println(map1.get(3));
	    map1.remove(3);
	    System.out.println(map.entrySet());
	    System.out.println(map1.entrySet());
	    System.out.println(map1.equals(map));
	    Set t = map.entrySet();
	    //t= map.keySet();
	    Iterator it = t.iterator();
	    if(it.hasNext()) {
	    System.out.println(it.next());
		System.out.println("Hello World");
		
		
		
		List list = new ArrayList();
		list.add(20);
		list.add(3);
		list.add(1);
		
		list.remove(1);
		list.remove(new Integer(1));
		
		System.out.println(list.size());
	    }
	}

}
