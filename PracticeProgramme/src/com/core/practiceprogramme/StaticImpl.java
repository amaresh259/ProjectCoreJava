package com.core.practiceprogramme;

public class StaticImpl {

	private volatile static String x = "";
	
	public void update() {
		x= "xyz";
	}
	public void reset() {
		x= "abc";
	}
	public static void main(String[] args) {

		StaticImpl s = new StaticImpl();
		s.reset();
		s.update();
		
		System.out.println(x);
	}

}
