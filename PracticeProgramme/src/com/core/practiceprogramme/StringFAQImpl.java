package com.core.practiceprogramme;

public class StringFAQImpl {

	/** Write a java program to capitalize each word in string **/
	public static String getCapitalizeEachWordOfString(String input) {
		
		String[] token = input.split("\\s");
		System.out.println(token[0]+" "+token[1]+" "+token[2]);
		
		String temp = "";
		
		/*for(int i= 0; i<token.length; i++) {
			String  x = String.valueOf(token[i].charAt(0)).toUpperCase();
			temp += token[i].replaceFirst(String.valueOf(token[i].charAt(0)), x) + " ";
		}*/
		
		//Also we can do same thing by substring
		for(String s : token) {
			String first = s.substring(0, 1);
			String afterFirst = s.substring(1);
			temp += first.toUpperCase() + afterFirst +" ";
		}
		
		System.out.println(temp.trim());
		return temp;
	}
	
	/** Write a java program to reverse each word in string **/
	public static String getReverseEachWordOfString() {
		
		String x = "School is temple for us";
		String[] word = x.split("\\s");
		StringBuilder result = new StringBuilder();
		System.out.println(word[0]+" "+word[1]+" "+word[2]+" "+word[3]+" "+word[4]);
		for(String w : word) {
			StringBuilder s = new StringBuilder(w);
			result.append(s.reverse() + " ");
		}
		String finalResult = String.valueOf(result);
		System.out.println(finalResult.trim());
		return "";
	}
	
	public static void main(String[] args) {
		//getCapitalizeEachWordOfString("Ram will play");
		getReverseEachWordOfString();
	}
}
