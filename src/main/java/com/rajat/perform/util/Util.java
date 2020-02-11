package com.rajat.perform.util;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class Util {
	
	
	
	public String generateInsertQuery(String str) {
		String startDateString = "08-12-2017";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(LocalDate.parse(startDateString, formatter).format(formatter2));
		
		
		
		return "rajat";
	}

}
