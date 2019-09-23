package Mentoring1;

import java.util.Scanner;

public class Test {

	
	 
	 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("WELCOME TO EMPLOYEE PROGRAMM");
		String oper ="1. Developer Operations\n"
				+ "2. Manager Operations\n"
				+ "TO EXIT PRESS'q'";
		System.out.println("*****************************************************************");
		System.out.println(oper);
		System.out.println("*****************************************************************");
		
		
		while(true){
			System.out.println("Please Enter a valid Operation");
			
			String op = scan.nextLine();
			
			
			if(op.equalsIgnoreCase("q")) {
				System.out.println("Ending the Program....");
				break;
			}else if(op.equals("1")) {
				
				
				Developer d = new Developer("Batyr", "Janyyev", 232445, "JAVA");
				
				System.out.println("Developer operations....");
				String dop = "1. Format\n"
						+ "2. Show Info\n"
						+ "TO EXIT PRESS 'q'";
				System.out.println(dop);
				
				System.out.println("Please Enter a valid Developer Operation:");
				String dec = scan.nextLine();
				if(dec.equalsIgnoreCase("q")) {
					
					System.out.println("Ending  developer operation programm...");
					break;
				}else if(dec.equals("1")) {
					System.out.println("Operation system:");
					
					String os = scan.nextLine();
					d.format(os);
				}else if(dec.equals("2")) {
					d.showInfo();
				}else {
					System.out.println("Invalid developer operation...");
				}
			}else if(op.equals("2")) {
				
				Manager m = new Manager("Merdan", "Yagmurov", 123135547, 50);
				
				System.out.println("Manager operations..");
				
			String op1 = "1. Increase Salary"
					+ "2. Show Info\n"
					+ "TO EXIT PRESS 'q'";
			System.out.println(op1);

			while(true) {
				
				System.out.println("Pease Enter a valid Manager Operation:");
				
				String mop = scan.nextLine();

				if(mop.equalsIgnoreCase("q")) {
					System.out.println("Ending Manager Operation Program...");
					break;
				}else if(mop.equals("1")) {
					System.out.println("What is the amount you wanna increase salary by?");
					
					int amount =  scan.nextInt();
					scan.nextLine();
					
					m.increaseWage(amount);
			
				}else if(mop.equals("2")) {
					
					m.showInfo();
				}else {
					System.out.println("Invalid Manager Operation...");
				}
				
				
			}
			
			
			}else {
				System.out.println("Invalid  Operation...");
			}
			
		}

	}
	 
}
