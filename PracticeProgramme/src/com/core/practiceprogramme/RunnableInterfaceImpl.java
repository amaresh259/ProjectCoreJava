package com.core.practiceprogramme;

public class RunnableInterfaceImpl implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 6; i++) {
			System.out.println("Runnable Test--"+i);
		}
		System.out.println("Runnable Test");
	}

	public static void main(String[] args) {

		RunnableInterfaceImpl obj1 = new RunnableInterfaceImpl();
		Thread t1 = new Thread(obj1);
		t1.start();
		//t1.start();
		
		new Thread(new RunnableInterfaceImpl()).start();
	}

}
