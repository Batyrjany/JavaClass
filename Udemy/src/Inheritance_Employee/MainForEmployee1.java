package Inheritance_Employee;

import java.util.Scanner;

public class MainForEmployee1 {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner (System.in);
    
    System.out.println("WELCOME TO EMPLOYEE PROGRAMM!");
    
    String oper = "Operations...\n"
    		+ "1. Developer operations \n"
    		+ "2.Admin operations\n"
    		+ "TO EXIT PRESS 'q'";
    System.out.println("************************************");
   	System.out.println(oper);
    System.out.println("************************************");
	
	
    while(true) {
    	System.out.println("Please Enter Operation");
        String  op= scan.nextLine();
        
        
    	if(op.equalsIgnoreCase("q")) {
    		System.out.println("Ending the Programm");
    		break;
    		
    	}else if(op.equals("1")) {
      Developer d =new Developer("Batyr", "Janyyev", 002, "JAVA");
    		
    		System.out.println("Developer Operations....");
    		String dev = "1. Format \n"
    	    		+ "2.Show INFO\n"
    	    		+ "TO EXIT PRESS 'q'";
    		System.out.println(dev);
    		while(true){
    			
    			System.out.println("Enter Valid Developer Operation");
    			String dop = scan.nextLine();
    			if(dop.equalsIgnoreCase("q")) {
    				System.out.println("Ending Developer Operations Programm...");
    				break;
    		   }else if (dop.equals("1")) {
    			   
    			   System.out.print("Operation System:");
    			   String os =  scan.nextLine();
    			   d.format(os);
    			   
    		   }else if (dop.equals("2")) {
    			   d.showInfo();
    		   }else {
    			   System.out.println("Invalid Developer Operation...");
    		   }
    		
    	}
       }else if(op.equals("2")) {

    	  Admin a1 = new Admin ("Gozel", "Janyyeva", 0123,10); 
    	  System.out.println("Employee operations...");
    	  String adm = "1. IncreaseWage\n"
    	  		+ "2.ShowInfo\n"
    	  		+ "TO WXIT PRESS 'q'"; 
    	   System.out.println(adm);
    	   while(true) {
    		   
    		   System.out.println("Enter valid admin operation....");
    		   
    		   String aop =scan.nextLine();
    		   if(aop.equalsIgnoreCase("q")) {
    			   System.out.println("Ending Admin Operations Programm...");
   				break;   
    		   }else if(aop.equals("1")) {
    			  
    			   System.out.println("What's the amount you want to increase salary by?");
    			   int amount = scan.nextInt();
    			   scan.nextLine();
    			   a1.increaseWage(amount);
    		   }else if(aop.equals("2")) {
    			 a1.showInfo();
       		   }else {
    			   System.out.println("Invalid Admin Operation...");
    		   }
    	   }
    	       	   
	   }else {
		System.out.println("Invalid Operation");
	}
    
	
	
	}
	}
}
