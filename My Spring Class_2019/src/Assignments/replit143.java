package Assignments;

import java.util.*;

public class replit143 {

	
		
		 public static void sign(int n)
		  {
		    //your code here
			int par = 0;
			 
			 if(n<0) {
				 par = -1;
			 }else if(n==0) {
				 par = 0;
			 }else {
				 par=1;
			 }System.out.println(par);
			 
			 
		  }//end sign
		  
		  public static void main(String[] args) {
		     Scanner inp = new Scanner(System.in);
		     int n = inp.nextInt();
		    
		    sign(n);
		  }
	
		
		
	}


