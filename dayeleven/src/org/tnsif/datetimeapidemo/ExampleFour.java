package org.tnsif.datetimeapidemo;

import java.time.Clock;

public class ExampleFour {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Clock c=Clock.systemUTC();
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1);

	}

}
