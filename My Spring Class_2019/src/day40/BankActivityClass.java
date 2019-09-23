package day40;

public class BankActivityClass {

	public static void main(String[] args) {
		
		  // Create another class called BankActivity with main method 
		  // create bank account object 
		  // set account holder name and balance value 
		  // call your showAccountHolder and showBalance method
		
		
		BankAccount customer1 = new BankAccount();
		customer1.accountHolder="Batyr";
		customer1.balance = 2983.5;
		
		customer1.showAcountHolder();
		customer1.showBalance();
		customer1.add100Dollar();
		customer1.showBalance();
		customer1.addDollar(5);
		customer1.showBalance();
		
		
		System.out.println();
		
		
		BankAccount customer2 = new BankAccount();
		customer2.accountHolder="asdsad";
		customer2.balance = 3000.0;

		customer2.showAcountHolder();
		customer2.showBalance();
		customer2.add100Dollar();
		customer2.showBalance();
		customer2.addDollar(50);
		customer2.showBalance();
		
		
		
	}

}
