package Account;

import java.util.Scanner;

public class ATM {

	
	
	public void operate(Account account) {
		
		
		
		Login login = new Login();
		
		Scanner scan= new Scanner(System.in);
		
		
		
		System.out.println("WELCOME TO OUR BANK...");
		
		System.out.println("***********************************************");
		
		System.out.println("USER LOGIN");
		
		System.out.println("***********************************************");

		int attempt= 3;
		
		
		
		while(true) {
			
			if(login.login(account)) {
				System.out.println("Entered Successfully");
				break;
			}else {
				System.out.println("Invalid input, Please try again");
				
				attempt--;
				System.out.println(attempt+" more attempts left");
			}
			
			if(attempt==0) {
				System.out.println("No more attempts left...");
				
				return;
			}
		}
		
		System.out.println("********************************************");
		
		String operations="1.Balance\n"
				+ "2.Deposit\n"
				+ "3.Withdraw\n"
				+ "TO EXIT PRESS q ";
		
		System.out.println(operations);
		System.out.println("********************************************");
		
		while(true) {
			System.out.println("Please sellect operation: ");
			String oper = scan.nextLine();
			
			if(oper.equals("q")) {
				break;
				
			}else if(oper.equals("1")) {
				System.out.println(account.getBalance());
				
			}else if(oper.equals("2")) {
				System.out.println("What's the amount for deposit?");
				int amout = scan.nextInt();
				scan.nextLine();
				
				account.deposit(amout);
				
				
			}else if(oper.equals("3")) {
				
				System.out.println("What's the withdrawal amount?");
				int amout = scan.nextInt();
				scan.nextLine();
				
				account.withdraw(amout);
				
			}else {
				System.out.println("INVALID OPERATION...");
				
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		

		/*
		 * OOP for ATM
		 * 
		 * 1.Login Class ---->>> will verify the login
		 * 
		 * 
		 * 2.Account Class ----->>> will operate the account
		 * 
		 * 
		 * 
		 * 3.ATM Class------>>> will operate the ATM 
		 * 
		 * 
		 */
		
      ATM atm= new ATM();
	
	
	Account account = new Account("Gozel Janyyeva", "12345", 2000);
	
	atm.operate(account);
	
	System.out.println("Exiting the program...");
	System.out.println("Thank You...");
	}
}
