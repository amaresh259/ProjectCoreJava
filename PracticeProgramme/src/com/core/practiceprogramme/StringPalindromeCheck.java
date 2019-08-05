package com.core.practiceprogramme;

import java.util.Scanner;

public class StringPalindromeCheck {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		
		System.out.println(inputString);
		
		char[] chArray = inputString.toCharArray();
		
		String rev = "";
		
		for(int i = chArray.length -1 ; i>=0; i--) {
			rev+=chArray[i];
		}
		System.out.println(rev);
		
		if(inputString.equals(rev)) {
			System.out.println("String is palidrome");
		}else {
			System.out.println("String is not palidrome");
		}
	}

}
