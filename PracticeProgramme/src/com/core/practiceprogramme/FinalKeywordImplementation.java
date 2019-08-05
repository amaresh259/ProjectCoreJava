package com.core.practiceprogramme;

public class FinalKeywordImplementation extends FinalClassImpl{
	
	final String x;
	final int y;
	final static int Z ;
	static int k = 5;
	int l = 4;
	
	//FinalClassImpl f = new FinalClassImpl();
	

	public FinalKeywordImplementation(String x, int y) {
		this.x = x;
		this.y = y;
	}
	
	static {
		Z = 5; 
	}
	
	public void testMethod() {
		//f.x = 6;
		FinalClassImpl.y = 6;
		//int g = f.y;
		
		for(int i = 0; i<4; i++) {
			k++;
			l++;
			String r = x.concat("bhghxd") ;
			System.out.println(this +"Inside method k value now--"+k+" Value for l--"+l);
		}
	}

	public static void main(String[] args) {

		FinalKeywordImplementation obj = new FinalKeywordImplementation("Test", 7);
		obj.testMethod();
		System.out.println("k value now--"+k+" Value for l--"+obj.l);
		FinalKeywordImplementation obj1 = new FinalKeywordImplementation("Test", 7);
		obj1.testMethod();
		System.out.println("k value now 2--"+k+" Value for l--"+obj.l);
	}

}
