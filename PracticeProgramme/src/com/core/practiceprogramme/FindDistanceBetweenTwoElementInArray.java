package com.core.practiceprogramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindDistanceBetweenTwoElementInArray {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//int[] x = {1,2,5,3,7,4,1,5,11,5,3,7,11,12,15};
		//int fE = 1;
		//int sE = 5;
		
		
		int size= s.nextInt();
		int fE = s.nextInt();
		int sE = s.nextInt();
		
		int[] x = new int[size] ;
		
		for(int i = 0; i < size; i++) {
			x[i] = s.nextInt();
		}
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i]+",");
		}
		
		
		
		List<Integer> fIndexList = new ArrayList<>();
		List<Integer> sIndexList = new ArrayList<>();
		
		
		for(int i=0; i < x.length; i++) {
			if(x[i] == fE) {
				fIndexList.add(i);
			}
		}
		
		for(int i=0; i < x.length; i++) {
			if(x[i] == sE) {
				sIndexList.add(i);
			}
		}
		
		Collections.sort(fIndexList);
		Collections.sort(sIndexList);
		
		System.out.println("First List"+fIndexList);
		System.out.println("Second List"+sIndexList);
		
		List<Integer> resultList = new ArrayList<>();
		
		for(int i =0; i<fIndexList.size(); i++) {
			for(int j=0; j<sIndexList.size(); j++) {
				if(fIndexList.get(i) < sIndexList.get(j)) {
					resultList.add(sIndexList.get(j) - fIndexList.get(i));
				}else if(fIndexList.get(i) > sIndexList.get(j)) {
					resultList.add(fIndexList.get(i) - sIndexList.get(j));
				}else {
					resultList.add(sIndexList.get(i) - fIndexList.get(j));
				}
			}
		}
		Collections.sort(resultList);
		System.out.println("Result List"+resultList);
		System.out.println(resultList.get(0));
	}

}
