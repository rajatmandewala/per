package com.rajat.perform.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class Util {
	
	
	
	public String generateInsertQuery(String str) {
<<<<<<< HEAD
	String s="IF(a.Year7='NA',a.Year7,CONCAT('<a href=javascript:void(0) onclick=getBonusDividend(\"',a.SCHCODE,'\"',',',\"'YEAR_7'\",',',\"'\"+entityBean.getAsOnDate()+\"'\", ')>',a.Year7,'</a>')) as Year7";
		
		
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("a.Day1ANN","a.Day7ANN","a.Day15ANN","a.Month1ANN",
				"a.Month3ANN","a.Month6ANN","a.Year1","a.Year2","a.Year3","a.Year4","a.Year5","a.Year6",
				"a.Year7","a.Year8","a.Year9","a.Year10","a.Year11","a.Year12","a.Year13","a.Year14","a.Year15",
				"a.Year20","a.YearSI"));
		ArrayList<String> l2=new ArrayList<>(Arrays.asList("DAY_1","DAY_7","DAY_15","MONTH_1","MONTH_3"
				,"MONTH_6","YEAR_1","YEAR_2","YEAR_3","YEAR_4","YEAR_5","YEAR_6","YEAR_7","YEAR_8"
				,"YEAR_9","YEAR_10","YEAR_11","YEAR_12","YEAR_13","YEAR_14","YEAR_15","YEAR_20","YEAR_SI"));
			
		  		    String g="";
		    
		    for(int i=0;i<l1.size();i++) {
		    	g=g+s.replace("a.Year7", l1.get(i).trim()).replace("YEAR_7",l2.get(i).trim()).replace("Year7", l2.get(i).trim())+", \n";
		    }
		    System.out.println(g);
=======
		String startDateString = "08-12-2017";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(LocalDate.parse(startDateString, formatter).format(formatter2));
>>>>>>> 0543a42cfd00aba9781b22ef4d0730435ab75532
		
		
		
		return "rajat";
	}

}
