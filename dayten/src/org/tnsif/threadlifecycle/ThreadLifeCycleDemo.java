package org.tnsif.threadlifecycle;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Tech t=new Tech();
		SoftSkills s=new SoftSkills();
		t.start();
		
        t.yield();
		
		s.start();
	
	}
}
