package com.core.practiceprogramme;

import java.util.ArrayList;
import java.util.List;

public class GerericTest {
	
	int x = 1;
	public int anyMethod(int x) {
		printf(this.hashCode());
		return 5;
	}
	
	public void printf(int x) {
		System.out.println("anyvalue---"+x);
	}

	public static void main(String[] args) {
		/*List<Number> nuList = new ArrayList<Number>();
		nuList.add(1);
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		
		List<Float> floatList = new ArrayList<Float>();
		floatList.add((float) 1.2);
		
		List<Double> dubleList = new ArrayList<Double>();
		dubleList.add((double) 4);
		
		nuList.add((Number) intList);
		*/
		GerericTest gen = new GerericTest();
		int x= 6;
		gen.anyMethod(x);
		
		
		
	}

}
