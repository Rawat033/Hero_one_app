package com.oneapp.test_suits;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MY_MIMI {
	
	
	
	public static void main(String[] args) {
//		String Str="Gunjan";
//		String Str1="Rawat";
//		StringBuilder sb=new StringBuilder();
//		System.out.println(Str1);
//		System.out.println(sb.replace(0,4,"Pawan"));
		
		
//		    Date date = new Date();  
//		    SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");  
//		    String strDate= formatter.format(date);  
//		    System.out.println(strDate);  
		    
		    
		      Calendar cal = Calendar.getInstance();
		      int cdate = cal.getWeekYear();
		      // get next year
		      cal.add(Calendar.YEAR, 1); 
		   //   Date nyear = cal.getTime();
		      //get previous year
		      cal.add(Calendar.YEAR, -18); 
		      Date pyear = cal.getTime();
		      System.out.println("\nCurrent Date : " + cdate);
		      System.out.println("\nDate before 1 year : " + pyear);
		      System.out.println("\nDate after 1 year  : " + "a"+"\n");  	
		   
		 
		
		
		
	}
	
	

}
