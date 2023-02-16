package org.tnsif.threaddemo;

class ThreadTwo extends Thread
{
	SynchronizationDemo d;
	public ThreadTwo(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try 
		{
			d.print(15);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
	}

}

