package day9;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter your name please : ");
	    
	    String name = scan.next(); 
	    String expectedName = "Batyr" ; 
	    
	    //boolean b =  (name == "Batyr"); 
	    // we use method from String class called equals 
	    
	    //boolean nameEqualToExpected = name.equals("Batyr"); 
	    boolean nameEqualToExpected = name.equals( expectedName ); 
	    
	    System.out.println(nameEqualToExpected);
	    
	    if(nameEqualToExpected){
	    //if( name.equals("Batyr") ){
	      System.out.println("That's Batyr");
	    }else{
	      System.out.println("NOT HIM !!");
	    }
	    
	    // TASK 2 
	    // Create a name variable to store your name 
	    // CREATE A SCANNER TO ASK FOR A NAME 
	    // compare the name with what you entered 
	    // print out thats my name if it's equal 
	    // print out thats not my name if its not 
	    
	    

	  }

	}








