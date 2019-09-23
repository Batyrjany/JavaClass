package Assignments;

import java.util.Scanner;

public class replit74 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		  
		    String SMSmessage = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		    int count = SMSmessage.length();
		
		    sender = SMSmessage.substring(SMSmessage.indexOf("<")+1,SMSmessage.indexOf(">"));
		    phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
		    messageBody = SMSmessage.substring(SMSmessage.indexOf("{")+1,SMSmessage.indexOf("}"));

		    System.out.println("Sender: "+sender);
		    System.out.println("Phone Number: "+phoneNumber);
		    System.out.println("Message body: "+messageBody);

		    

	}

}
