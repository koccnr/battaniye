package com.example.demo.dizi1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateObj {

	public static void main(String[] args) {


		
		LocalDateTime dt=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy / hh:mm");
		System.out.println(dt.format(format));
		
		
			
				
	}

}
