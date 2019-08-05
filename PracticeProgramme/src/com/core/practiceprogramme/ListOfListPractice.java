package com.core.practiceprogramme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListPractice {

	public static void main(String[] args) {
		List<List<List<Integer>>> lists = new ArrayList<>();
		
		List<Integer> finallist = new ArrayList<>();
		for (List<List<Integer>> list : lists) {
			for (List<Integer> list2 : list) {
				for (Integer integer : list2) {
					finallist.add(integer);
				}
			}
			
		}
		
		List<Integer> flat = lists
							.stream()
							.flatMap(List::stream)
							.flatMap(List::stream)
							.collect(Collectors.toList());
		
		System.out.println(flat);
		
		LocalDate date;
		 
	}
	
}
