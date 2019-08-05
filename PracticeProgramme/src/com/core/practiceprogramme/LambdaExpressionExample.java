package com.core.practiceprogramme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionExample {

	/* Find the list of String Which length is greater than 2 */
	public static void filterListOfString(List<String> listOfString) {
		List<String> xList = listOfString.stream().filter(x -> x.length()>2).collect(Collectors.toList());
		System.out.println(xList);
		
	}
	
	/* Find the list of Integer  */
	public static void filterOddIntegerList(List<String> listOfString) {
		List<Integer> xInteger = listOfString.stream().map(Integer :: parseInt).filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println(xInteger);
	}
	
	
	
	
	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<>();
		listOfString.add("df");
		listOfString.add("dfnbhg");
		listOfString.add("dfbv");
		listOfString.add("hg");
		
		List<String> listOfInteger = new ArrayList<>();
		listOfInteger.add("1");
		listOfInteger.add("3");
		listOfInteger.add("8");
		listOfInteger.add("5");
		
		
		filterListOfString(listOfString);
		filterOddIntegerList(listOfInteger);
	}

}
