package Assignments;

import java.util.Scanner;

public class replit98 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
       
	    
	    int countjava= 0;
	    int countpython = 0;
	  
	    int l = sentence.length();
	    
	String sum ="";
	
	
	for (int i = 0; i < l-1; i++) {
		
	
		
		if(sentence.contains("java")) 
			countjava++;
		}
		
		
	for (int j= 0; j < l-6; j++) {	
		//if(sentence.substring(j,j+6).equals("python"))
		if(sentence.contains("python")) 
			countpython++;
		}
	
	System.out.println(countpython);
	if(countjava==countpython) {
		sum="true";
	}else if(countjava!=countpython){
		sum="false";
	}
		
		System.out.println(sum);    	

//		 int countjava= 0;
//		    int countpython = 0;
//		  
//		    int l = sentence.length();
//		    
//		String sum ="";
//		
//		
//		for (int i = 0; i < l-4; i++) {
//			
//		
//			
//			if(sentence.substring(i,i+4).equals("java")) 
//				countjava++;
//			}
//			
//			
//		for (int j= 0; j < l-6; j++) {	
//			if(sentence.substring(j,j+6).equals("python")) 
//				countpython++;
//			}
//		
//		
//		if(countjava==countpython) {
//			sum="true";
//		}else if(countjava!=countpython){
//			sum="false";
//		}
//			
//			System.out.println(sum);    	
//		
		
	   
	}
	    	
	    	
	}


