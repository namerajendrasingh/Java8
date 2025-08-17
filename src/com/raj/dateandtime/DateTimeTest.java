package com.raj.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * @author Raj Singh
 * 7. New Date and Time API (java.time)
  Need:
	The old java.util.Date and Calendar classes were error-prone, mutable, and lacked modern features. 
	Java 8’s Date/Time API is inspired by Joda-Time, 
	offering immutable, comprehensive date and time handling.
 */
public class DateTimeTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(zdt);
	}

}
