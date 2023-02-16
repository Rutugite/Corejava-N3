package org.tnsif.threaddemo;
//program to demonstrate on thread class
//Driver class
public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		//used to change the thread name
		p.setName("Java Thread");
		//used to change the priority
		p.setPriority(8);
		//when thread calls to thread method it will call run method
		p.start();
		p.run();
		//once we call the start method again we can't restart
		//p.start();
		System.out.println("Current Thread"+p);

	}

}
