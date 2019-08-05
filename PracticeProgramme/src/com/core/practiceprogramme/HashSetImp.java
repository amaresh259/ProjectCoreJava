package com.core.practiceprogramme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetImp {

	public static void main(String[] args) {

		
		Set<String> set = new CopyOnWriteArraySet();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("fhgf--"+it.next());
			if(it.next().equals("2")) {
				set.remove("3");
			}
			
		}
		System.out.println(set);
		
	}

}
