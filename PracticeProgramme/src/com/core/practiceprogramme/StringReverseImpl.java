package com.core.practiceprogramme;

public class StringReverseImpl {

	public static void main(String[] args) {

		//String x = "input is mandatory";
		String x = "SCHOOL";
		char[] temp = new char[x.length()];
		
		for(int i = 0; i<x.length(); i++) {
			
			temp[i] = x.charAt(x.length() - (i+1));
		}
		
		//String y = new String(temp);
		
		String y = String.valueOf(temp);
		
		System.out.println(y);
	}

}
