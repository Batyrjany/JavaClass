package Assignments;

import java.util.*;

public class replit145 {

	public static void main(String[] args) {
		

		 
		 
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		    
		    
		   
		    
		   // System.out.println(Arrays.toString(arr));
		    
		   
		    
		  }
		  
	
	
	
		   public static void person(String info) 
			{
			
				//your code here
			   String[] arr = info.split(",");
			   String name = "";
			    String lastname = "";
			    String age = "";
			    
			    for (int i = 0; i < arr.length; i++) {
					name = arr[0];
					lastname = arr[1];
			    	age = arr[2];
			    	
				}
			    
			    
			    
			    System.out.println("person name: "+name+ " last name: "+lastname+ " age: "+age);
			    
			  
				
			}
			   
			   
			   
			
			}//end person
		  
		