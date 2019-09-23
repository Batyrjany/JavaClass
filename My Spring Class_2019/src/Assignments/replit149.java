package Assignments;

import java.util.*;

public class replit149 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		    String s = "12:01:52AM";	
		    
		  }
		  
		  public static void timeConversion(String s) {
		    /*
				 * Write your code here.
				 */
			
			  int hour=Integer.valueOf(s.substring(0,s.indexOf(':')));
			  int min =Integer.valueOf(s.substring(s.indexOf(':')+1,s.lastIndexOf(':')));
			  int sec =Integer.valueOf(s.substring(s.lastIndexOf(':')+1,s.indexOf('M')-1));
			  
			  String minsec= s.substring(s.indexOf(':'),s.indexOf('M')-1);
			  
			  String result ="";
			  
			  
			  if(s.endsWith("AM")) {
				  
				  if(hour==12) {
					  result = "00"+minsec;
				  }else {
					  result=s.replace("AM", "");
				  }
				  
			  }else {
				  if(hour==12) {
					  result = s.replace("PM", "");
				  }else {
					  result = (hour+12)+minsec;
				  }
			  }
			  System.out.println(result);
				 
		  }
		}