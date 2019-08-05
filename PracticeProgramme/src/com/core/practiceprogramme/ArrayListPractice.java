package com.core.practiceprogramme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(1, 3);
		System.out.println("Hello" +list);
		list.add(3, 6);
		System.out.println("Hello" +list);
		list.remove(1);
		
		System.out.println("Hello" +list.get(1));
		
		List<String> strings = new ArrayList<>();
		strings.add("Ram");
		strings.add("Shyam");
		strings.add("Hari");
		
		Iterator<String> it = strings.iterator();
		if(it.hasNext()) {
			
		}
		
		ListIterator<String> it1 = strings.listIterator(strings.size());
		if(it1.hasPrevious()) {
			System.out.println("fjhsdhsgfd---"+it1.previous());
			
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("Files");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(strings);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list1 = (ArrayList)ois.readObject();
			
			System.out.println(list1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
