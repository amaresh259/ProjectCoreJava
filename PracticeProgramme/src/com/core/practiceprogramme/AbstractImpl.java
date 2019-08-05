package com.core.practiceprogramme;

public abstract class AbstractImpl {

	AbstractImpl(int a, int b){
		this.test();
		System.out.println("Just checking...");
	}
	
	 public void test(){
		System.out.println("test");
	}
	public static void main(String[] args) {
		new AbstractImpl(1,2) {};
		

	}

}
