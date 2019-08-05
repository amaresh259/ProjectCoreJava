package com.core.practiceprogramme;

import java.io.PrintStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ThreadImpl extends Thread {
	
	static PrintStream obj = System.out;
	@Override
	public void run() {
		for(int i = 1; i<4; i++) {
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			obj.println("ThreadRunning "+this.getName()+" --> "+i);
		}
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		AbstractList<String> list1 = new ArrayList<>();

		Thread t = Thread.currentThread();
		obj.println("Main Thread--"+t);
		
		ThreadImpl t1 = new ThreadImpl();
		obj.println("Child Thread--"+t1);
		//t1.setDaemon(true);
		obj.println("Daemon Thread--"+t1.isDaemon());
		
		ThreadImpl t2 = new ThreadImpl();
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
	}

}
