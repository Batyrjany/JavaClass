package Assignments;

import java.util.Scanner;

public class replit71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String name = "";
	    String surname = "";
	    String domain = "";
	    if(email.contains("_")){
	      name=email.substring(0, email.indexOf("_"));
	      surname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	      domain = email.substring(email.indexOf("@"));
	      System.out.println(surname+"_"+name+domain);
	      
	    }else{
	      System.out.println(email);
	    }
	    
	    
	    
	  }
	
	}

