package org.gradle;

import org.joda.time.LocalTime;

public class GradleStudy {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
		Greeter greeter = new Greeter();
		System.out.print(greeter.sayHello());
	}
}
