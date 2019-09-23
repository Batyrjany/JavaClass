package day30;

import java.util.Scanner;

public class Utility {

	  public static void printUsersName() {
	    
	    Scanner scan = new Scanner(System.in) ; 
	    System.out.println("Enter your name please");
	    
	    String name = scan.next(); 
	    System.out.println("You entered : " + name);    
	    
	  }
	  
	  public static void main(String[] args) {  
	    
	    printUsersName() ; 
	    printUsersName() ; 
	  

  }

}
