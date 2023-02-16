package org.tnsif.threaddemo;

public class SynchronizationDemo {
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
		
		}
	}

}
//thread1

class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
