package com.core.practiceprogramme;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {

		List<Integer> integers = new LinkedList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		System.out.println(integers);
		integers.add(1, 5);
		System.out.println(integers);
		integers.remove(1);
		System.out.println(integers);
		System.out.println(integers.get(1));
		integers.add(3, 5);
		System.out.println(integers);
		integers.remove(new Integer(1));
		System.out.println(integers);
		
		List<String> list = new LinkedList<>();
		
		list.add("Ram");
		list.add(1, "Shyam");
		list.add("Hari");
		
		System.out.println(list);
		list.remove("Shyam");
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		if(it.hasNext()) {
			System.out.println("qwcsgndssdfsfsshgcd---"+it.next());
		}
		
		ListIterator<Integer> it1 = integers.listIterator();
		while(it1.hasPrevious()) {
			System.out.println("csgndshgcd"+it1.previous());
		}
		
	}

}
