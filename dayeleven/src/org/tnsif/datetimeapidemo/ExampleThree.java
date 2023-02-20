package org.tnsif.datetimeapidemo;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class ExampleThree {

	public static void main(String[] args) {
		OffsetDateTime d=OffsetDateTime.now();
		OffsetTime d1=OffsetTime.now();
		System.out.println(d);
		System.out.println(d1);
	}

}
