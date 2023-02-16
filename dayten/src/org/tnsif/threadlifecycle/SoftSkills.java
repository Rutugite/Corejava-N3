package org.tnsif.threadlifecycle;

public class SoftSkills extends Thread{
	public void run()
	{
		System.out.println("Professional Ethics");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println("SoftSkill Session");
	}

}
