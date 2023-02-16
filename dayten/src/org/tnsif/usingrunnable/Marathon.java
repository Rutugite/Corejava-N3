package org.tnsif.usingrunnable;
//program to demonstrate on runnbale interface
public class Marathon implements Runnable{
	private int speed;
	private String city;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void run() {
		System.out.println("Speed of participant:"+speed+"The city is:"+city);
		
	}
}

