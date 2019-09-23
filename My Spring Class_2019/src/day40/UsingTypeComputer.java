package day40;

import java.util.*;

public class UsingTypeComputer {

	public static void main(String[] args) {
		

		/*
		 * what we can do when we have a class
		 * 
		 * 
		 * it will become a type
		 * Create a reference variable Computer iMac
		 * Use it as a method parameter
		 * Use it as a return type
		 * Use it as a type for ArraList object
		 * 
		 * 
		 */
		
		 Computer myComputer = new Computer(); 
	     
	   //  ArrayList<String> lst = new ArrayList<>();
		 ArrayList<Computer> comlst = new ArrayList<>();
	     comlst.add(myComputer); 
	     comlst.add( new Computer() ); 
	     
	     
	    // String   str    = new String("actual String"); 
	    // String[] strArr = new String[3] ; 
	     Computer myComp = new Computer(); 
	     Computer[] comArr = new Computer[3]; 
	     
	     
	     printComputer( myComp );
	   
	      Computer com1 = getComputer();
	      System.out.println(com1);
	     
	     
//	     String str = getString();
//	     System.out.println(str);
	     
	  }
	  
	
	
    	  public static String getString() {
          return "my string" ; 
             }
    	  
	  /// WE Created a method that return computer object
	  public static Computer getComputer() {
	    // in order to return computer object 
	    // first we need to create an object
	    Computer iMac = new Computer(); 
	    iMac.OS = "MAC OS"; 
	    return iMac;  // returned computer object
	    
	  }

	 
	  
	  
	  
	  
	  
	  public static void printString(String strObj) {
		    System.out.println(strObj);
		  } 
	  // created a method that accept computer as parameter
	  // so when we call this method
	  // we will pass computer object as argument 
	  public static void printComputer(Computer comObject) {
	    
	    System.out.println("computer object" );
	    
	  }
	  
	
	  


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}

