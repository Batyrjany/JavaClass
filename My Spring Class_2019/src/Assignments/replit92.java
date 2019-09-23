package Assignments;

import java.util.Scanner;

public class replit92 {

	public static void main(String[] args) {
		

		
		 Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();
		
		json = json.replace('"',' ').replace(':',' ').replaceAll(" ", "");
		
		int f = json.indexOf("firstName");
		int l = json.indexOf("lastName");
		int r = json.indexOf("role");
		
		
		System.out.println("First name: "+ json.substring(f+9,l-1));
		
		System.out.println("Last name: "+ json.substring(l+8,r-1));
		
	  
	}
	}


