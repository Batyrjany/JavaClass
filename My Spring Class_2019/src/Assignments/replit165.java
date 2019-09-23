package Assignments;

import java.util.Scanner;

public class replit165 {

	 public static void main(String[] args){
		    Scanner s=new Scanner(System.in);
		    String o=s.next();
		    String t=s.next();
		    
		    System.out.println(mergeStrings(o,t));
		  }

	public static String mergeStrings(String one, String two) {
	   
		
		String str="";
		
		
	    if (one.length()>two.length()) {
	    	
	          for (int i=0; i< two.length();  i++){
	      
	      str=str+one.charAt(i)+two.charAt(i);
	    }
	        for (int j=two.length(); j<one.length();j++) {
	    	str=str+one.charAt(j);
	    }
	    }else {
	    	for (int i=0; i< one.length();  i++){
	  	      
	  	      str=str+one.charAt(i)+two.charAt(i);
	  	    }
	  	    for (int j=one.length(); j<two.length();j++) {
	  	    	str=str+two.charAt(j);
	  	    }
	    	
	    }
	    
	    return str;
	    
	  }
}
	 