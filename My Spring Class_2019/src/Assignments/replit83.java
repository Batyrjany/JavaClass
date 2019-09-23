package Assignments;

import java.util.Scanner;

public class replit83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);

	    
	    // your code 
	   // ------------------------------------------
 

		
		
		String answer, guest2 = "", guest = "";
        do {

            System.out.println("Please enter guest name:");
            guest = input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase("no"))
                guest2 += guest;
            else
                guest2 += guest + ", ";
        } while (answer.equalsIgnoreCase("yes"));
        System.out.println("Guest's list: "+guest2);
		
		
	}
		
		
	}	
		
		
		
	


