package com.core.practiceprogramme;

import java.util.HashMap;
import java.util.Map;

public class MethodOverridingOverloadingImpl {

	public void MyTest(Object obj) {
		System.out.println("Object");
	}
	
	public void MyTest(String s) {
		System.out.println("String");
	}
	
	public static void main(Object[] args) {
		System.out.println("Object");
		
	}
	
	private Map<String, String> map = new HashMap<>();
	
	public void addValueInMap() {
		map.put("Mike", "Mouse");
		map.put("Mike", "Mise");
		System.out.println(map.keySet().size());
	}
	
	public static void main(String[] args) {
		
		/*System.out.println("String");
		MethodOverridingOverloadingImpl impl = new MethodOverridingOverloadingImpl();
		impl.MyTest(null);*/
		
		MethodOverridingOverloadingImpl impl = new MethodOverridingOverloadingImpl();
		impl.addValueInMap();
		
	}

}
